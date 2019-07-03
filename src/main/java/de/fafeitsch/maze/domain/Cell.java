package de.fafeitsch.maze.domain;

public class Cell {

    private int x;
    private int y;
    private CellList neighbours;

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
        this.neighbours = new CellList();
    }

    public void addNeighbour(Cell neighbour){
        this.neighbours.addToFront(neighbour);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Cell{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}