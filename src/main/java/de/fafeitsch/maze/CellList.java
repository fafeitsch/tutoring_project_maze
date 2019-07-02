package de.fafeitsch.maze;

public class CellList {

    private CellListItem first;

    public void addToFront(Cell cell){
        CellListItem item = new CellListItem(cell);
        item.setNext(first);
        this.first = item;
    }

    public Cell poll(){
        CellListItem result = first;
        if(first != null){
            first = first.getNext();
        }
        return first.getContent();
    }

    public void enqueue(Cell cell){
        if(this.first == null){
            this.first = new CellListItem(cell);
            return;
        }
        CellListItem current = this.first;
        while(current.getNext() != null){
            current = current.getNext();
        }
        current.setNext(new CellListItem(cell));
    }

    public int getSize(){
        int size = 0;
        CellListItem current = this.first;
        while(current != null){
            size = size + 1;
        }
        return size;
    }
}
