package com.leetcode.algo.array.spiral_matrix_2;

public class SpiralMatrix2 {
    private static class Edges {
        private int left;
        private int right;
        private int top;
        private int bottom;

        public Edges(int left, int right, int top, int bottom) {
            this.left = left;
            this.right = right;
            this.top = top;
            this.bottom = bottom;
        }

        public boolean inRange(final int row, final int column) {
            return (row >= top) && (row <= bottom) &&
                    (column >= left) && (column <= right);
        }

        public boolean inRange(final Position position) {
            return inRange(position.row, position.column);
        }
    }

    private static class Position {
        private int row;
        private int column;

        public Position(int row, int column) {
            this.row = row;
            this.column = column;
        }

        public void move(Position directionBy) {
            row += directionBy.row;
            column += directionBy.column;
        }
    }

    private static final Position LEFT;
    private static final Position RIGHT;
    private static final Position UP;
    private static final Position DOWN;

    static {
        LEFT = new Position(0, -1);
        RIGHT = new Position(0, 1);
        UP = new Position(-1, 0);
        DOWN = new Position(1, 0);
    }

    private int[][] matrix;
    private Edges edges;
    private Position moveBy;

    public int[][] generateMatrix(int n) {
        init(n);

        fillSpiral(n);

        int[][] spiralMatrix = matrix;

        deinit();
        return spiralMatrix;
    }

    private void init(final int n) {
        matrix = new int[n][];
        for (int i = 0; i < n; ++i) {
            matrix[i] = new int[n];
        }

        edges = new Edges(0, n - 1, 0, n - 1);
        moveBy = RIGHT;
    }

    private void deinit() {
        edges = null;
        matrix = null;
    }

    private void fillSpiral(final int spiral) {
        var position = new Position(0, 0);
        int value = 1;
        do {
            matrix[position.row][position.column] = value++;
        } while (nextPosition(position));
    }

    private boolean nextPosition(Position position) {
        if (moveBy == LEFT) {
            return moveLeft(position);
        } else if (moveBy == RIGHT) {
            return moveRight(position);
        } else if (moveBy == UP) {
            return moveUp(position);
        } else if (moveBy == DOWN) {
            return moveDown(position);
        }
        throw new UnsupportedOperationException();
    }

    private boolean move(Position position, Position moveBy) {
        position.move(moveBy);
        return edges.inRange(position);
    }

    private boolean moveRight(Position position) {
        if (!move(position, RIGHT))     return false;

        if (position.column == edges.right) {
            ++edges.top;
            moveBy = DOWN;
        }
        return true;
    }

    private boolean moveLeft(Position position) {
        if(!move(position, LEFT))   return false;

        if (position.column == edges.left) {
            --edges.bottom;
            moveBy = UP;
        }
        return true;
    }

    private boolean moveUp(Position position) {
        if(!move(position, UP))     return false;

        if (position.row == edges.top) {
            ++edges.left;
            moveBy = RIGHT;
        }
        return true;
    }

    private boolean moveDown(Position position) {
        if(!move(position, DOWN))       return false;

        if (position.row == edges.bottom) {
            --edges.right;
            moveBy = LEFT;
        }
        return true;
    }
}
