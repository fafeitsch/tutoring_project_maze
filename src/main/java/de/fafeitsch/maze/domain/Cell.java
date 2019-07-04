package de.fafeitsch.maze.domain;

public class Cell {

    private final int row;
    private final int col;
    private CellList neighbours;
    private Cell predecessor;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
        this.neighbours = new CellList();
    }

    public void addNeighbour(Cell neighbour) {
        this.neighbours.addToFront(neighbour);
    }

    public int getRow() {
        return this.row;
    }

    public int getCol() {
        return this.col;
    }

    public Cell getPredecessor() {
        return this.predecessor;
    }

    public void setPredecessor(Cell predecessor) {
        this.predecessor = predecessor;
    }

    public boolean wasVisited() {
        return this.predecessor != null;
    }

    public Cell[] getNeighboursAsArray() {
        return this.neighbours.toArray();
    }

    @Override
    public String toString() {
        return "Cell{" +
                "row=" + this.row +
                ", col=" + this.col +
                '}';
    }
}