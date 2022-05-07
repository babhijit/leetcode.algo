package com.leetcode.algo.array.min_cost_connect_all_points;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class MinCostConnectedPoints_UF {
    public static class Point {
        private final int x;
        private final int y;

        public Point(int[] point) {
            this.x = point[0];
            this.y = point[1];
        }

        public int manhattanDistance(Point o) {
            return (Math.abs(x - o.x) + Math.abs(y - o.y));
        }
    }

    public static class Edge implements Comparable<Edge> {
        private final int v;
        private final int w;
        private final int manhattanDistance;

        public Edge(int v, int w, final Point[] points) {
            this.v = v;
            this.w = w;
            this.manhattanDistance = points[v].manhattanDistance(points[w]);
        }

        @Override
        public int compareTo(Edge o) {
            return Integer.compare(manhattanDistance, o.manhattanDistance);
        }
    }

    private static class UnionFind {
        private final Point[] vertices;
        private final int[] root;
        private final int[] size;

        private int connectedComponents;

        public UnionFind(final int N, final Point[] vertices) {
            this.vertices = vertices;
            this.connectedComponents = N;

            root = new int[N];
            for (int i = 0; i < N; ++i) {
                root[i] = i;
            }

            size = new int[N];
            Arrays.fill(size, 1);
        }

        public boolean connected(int a, int b) {
            return find(a) == find(b);
        }

        private int find(int child) {
            int parent = root[child];

            while (parent != child) {
                child = parent;
                parent = root[child];
            }

            return parent;
        }

        public void union(final int v, final int w) {
            int vParent = find(v);
            int wParent = find(w);

            if (size[vParent] < size[wParent]) {
                root[wParent] = root[vParent];
                size[vParent] += size[wParent];
            } else {
                root[vParent] = root[wParent];
                size[wParent] += size[vParent];
            }
            --connectedComponents;
        }
    }

    public int minCostConnectPoints(int[][] points) {
        final int N = points.length;
        Point[] vertices = new Point[N];

        for (int i = 0; i < N; ++i) {
            vertices[i] = new Point(points[i]);
        }

        var pq = new PriorityQueue<Edge>(Edge::compareTo);
        for (int i = 0; i < N; ++i) {
            vertices[i] = new Point(points[i]);
            for (int j = i + 1; j < N; ++j) {
                pq.offer(new Edge(i, j, vertices));
            }
        }

        int minCost = 0;
        var uf = new UnionFind(N, vertices);
        while (uf.connectedComponents != 1) {
            var edge = pq.poll();
            int v = edge.v; int w = edge.w;
            if (!uf.connected(v, w)) {
                uf.union(v, w);
                minCost += edge.manhattanDistance;
            }
        }
        return minCost;
    }
}
