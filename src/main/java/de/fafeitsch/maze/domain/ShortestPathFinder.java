package de.fafeitsch.maze.domain;

public class ShortestPathFinder {

    private final char[][] maze;

    public ShortestPathFinder(char[][] maze) {
        this.maze = maze;
    }

    private static CellList findShortestPath(Cell start, int endRow, int endCol) {
        CellList queue = new CellList();
        queue.enqueue(start);
        Cell current = null;
        while (!queue.isEmpty()) {
            current = queue.poll();
            if (current.getRow() == endRow && current.getCol() == endCol) {
                break;
            }
            Cell[] neighbours = current.getNeighboursAsArray();
            for (int i = 0; i < neighbours.length; i++) {
                Cell neighbour = neighbours[i];
                if (neighbour.wasVisited() || neighbour == start) {
                    continue;
                }
                neighbour.setPredecessor(current);
                queue.enqueue(neighbour);
            }
        }

        CellList path = new CellList();
        path.addToFront(current);
        while (current.getPredecessor() != null) {
            current = current.getPredecessor();
            path.addToFront(current);
        }
        return path;
    }

    public void drawShortestPathInMaze(int startRow, int startCol, int endRow, int endCol) {
        Cell start = MazeBuilder.buildMaze(this.maze, startRow, startCol);
        CellList shortestPath = ShortestPathFinder.findShortestPath(start, endRow, endCol);

        Cell current = shortestPath.poll();
        while (!shortestPath.isEmpty()) {
            this.maze[current.getRow()][current.getCol()] = '*';
            current = shortestPath.poll();
        }
        this.maze[current.getRow()][current.getCol()] = '*';
    }
}
