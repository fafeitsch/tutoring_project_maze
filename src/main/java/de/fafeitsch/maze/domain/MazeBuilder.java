package de.fafeitsch.maze.domain;

public class MazeBuilder {

    public static Cell buildMaze(char[][] maze, int startRow, int startCol) {
        Cell[][] cells = new Cell[maze.length][];
        for (int row = 0; row < maze.length; row++) {
            cells[row] = new Cell[maze[row].length];
        }

        for (int row = 0; row < maze.length; row++) {
            for (int col = 0; col < maze[row].length; col++) {
                if (maze[row][col] != '█') {
                    cells[row][col] = new Cell(row, col);
                }
            }
        }

        setNeighbours(cells);
        return cells[startRow][startCol];
    }

    private static void setNeighbours(Cell[][] cells) {
        for (int row = 0; row < cells.length; row++) {
            for (int col = 0; col < cells[row].length; col++) {
                Cell cell = cells[row][col];
                if (cell != null) {
                    if (row >= 1 && cells[row - 1][col] != null) {
                        cell.addNeighbour(cells[row - 1][col]);
                    }
                    if (col >= 1 && cells[row][col - 1] != null) {
                        cell.addNeighbour(cells[row][col - 1]);
                    }
                    if (row < cells.length - 1 && cells[row + 1][col] != null) {
                        cell.addNeighbour(cells[row + 1][col]);
                    }
                    if (col < cells[row].length - 1 && cells[row][col + 1] != null) {
                        cell.addNeighbour(cells[row][col + 1]);
                    }
                }
            }
        }
    }
}
