package de.fafeitsch.maze.domain;

public class CellList {

    private CellListItem first;

    public void addToFront(Cell cell) {
        CellListItem item = new CellListItem(cell);
        item.setNext(this.first);
        this.first = item;
    }

    public Cell poll() {
        CellListItem result = this.first;
        if (this.first != null) {
            this.first = this.first.getNext();
        }
        return result.getContent();
    }

    public void enqueue(Cell cell) {
        if (this.first == null) {
            this.first = new CellListItem(cell);
            return;
        }
        CellListItem current = this.first;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(new CellListItem(cell));
    }

    public boolean isEmpty() {
        return this.first == null;
    }

    public Cell[] toArray() {
        Cell[] result = new Cell[this.getSize()];
        if (this.first == null) {
            return result;
        }
        CellListItem current = this.first;
        int index = 0;
        while (current != null) {
            result[index] = current.getContent();
            current = current.getNext();
            index = index + 1;
        }
        return result;
    }

    public int getSize() {
        int size = 0;
        CellListItem current = this.first;
        while (current != null) {
            size = size + 1;
            current = current.getNext();
        }
        return size;
    }
}
