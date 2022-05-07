package com.leetcode.algo.array.min_cost_connect_all_points;

import java.util.*;

public class MinCostConnectedPoints {
    private static class Point {
        private final int index;
        private final int x;
        private final int y;

        public Point(final int index, final int[] point) {
            this.index = index;
            x = point[0];
            y = point[1];
        }

        public int manhattanDistance(final Point pt) {
            return Math.abs(x - pt.x) + Math.abs(y - pt.y);
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Point) {
                var o = (Point) obj;
                return Objects.equals(x, o.x) && Objects.equals(y, o.y);
            }
            return false;
        }
    }

    private static class Edge implements Comparable<Edge> {
        private final Point v;
        private final Point w;
        private final int manhattanDistance;

        public Edge(final Point v, Point w) {
            this.v = v;
            this.w = w;
            this.manhattanDistance = this.v.manhattanDistance(this.w);
        }

        @Override
        public int compareTo(Edge o) {
            return Integer.compare(manhattanDistance, o.manhattanDistance);
        }

        public Point either() {
            return this.v;
        }

        public Point other(Point v) {
            if (this.v.equals(v)) return this.w;
            else if (this.w.equals(v)) return this.v;
            else throw new IllegalArgumentException("Illegal Endpoint");
        }
    }

    private static class Bag implements Iterable<Edge> {
        private final Edge[] edges;
        private final int N;

        public Bag(final Point[] points, final int s) {
            N = points.length - 1; // two points make an edge
            edges = new Edge[N];

            var v = points[s];
            int j = 0;
            for (int w = 0; w < points.length; ++w) {
                if (w != s) {
                    edges[j++] = new Edge(v, points[w]);
                }
            }
        }

        @Override
        public Iterator<Edge> iterator() {
            return new BagIterator();
        }

        private class BagIterator implements Iterator<Edge> {
            int i = 0;

            @Override
            public boolean hasNext() {
                return i < N;
            }

            @Override
            public Edge next() {
                if (i >= N) throw new NoSuchElementException();
                return edges[i++];
            }
        }
    }

    private static class Graph {
        private final int V;
        private final Bag[] adj;

        public Graph(final Point[] points) {
            V = points.length;
            adj = new Bag[V];

            for (int p = 0; p < V; ++p) {
                adj[p] = new Bag(points, p);
            }
        }

        public Bag adj(final int v) {
            if (v < 0 || v >= V) throw new IllegalArgumentException("Illegal vertex");
            return adj[v];
        }

        public int V() {
            return V;
        }
    }

    public int minCostConnectPoints(int[][] points) {
        final int N = points.length;
        Point[] vertices = new Point[N];
        for (int v = 0; v < N; ++v) {
            vertices[v] = new Point(v, points[v]);
        }

        var G = new Graph(vertices);
        var mst = new MST(G);
        return mst.minDistance();
    }

    private class MST {
        private Queue<Edge> mst;
        private Queue<Edge> pq;
        private boolean[] marked;

        public MST(final Graph G) {
            mst = new LinkedList<>();
            pq = new PriorityQueue<>(G.V(), Edge::compareTo);
            marked = new boolean[G.V()];

            for (int s = 0; s < G.V(); ++s) {
                if (!marked[s]) {
                    prim(G, s);
                }
            }
        }

        private void prim(final Graph G, final int s) {
            scan(G, s);

            while (!pq.isEmpty()) {
                var e = pq.remove();
                var v = e.either();
                var w = e.other(v);
                if (marked[v.index] && marked[w.index]) {
                    continue;
                }
                mst.add(e);
                if (!marked[v.index]) scan(G, v.index);
                if (!marked[w.index]) scan(G, w.index);
            }
        }

        private void scan(final Graph G, final int v) {
            marked[v] = true;
            for (Edge e : G.adj(v)) {
                var w = e.other(e.v);
                if (!marked[w.index]) {
                    pq.add(e);
                }
            }
        }

        int minDistance() {
            int distance = 0;
            for (var edge : mst) {
                distance += edge.manhattanDistance;
            }
            return distance;
        }
    }
}
