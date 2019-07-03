package de.fafeitsch.maze.domain;

public class CellListItem {

    private Cell content;
    private CellListItem next;

    public CellListItem(Cell content) {
        this.content = content;
    }

    public Cell getContent() {
        return content;
    }

    public void setContent(Cell content) {
        this.content = content;
    }

    public CellListItem getNext() {
        return next;
    }

    public void setNext(CellListItem next) {
        this.next = next;
    }
}
