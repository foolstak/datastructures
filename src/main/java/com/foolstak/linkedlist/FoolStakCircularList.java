package com.foolstak.linkedlist;

public class FoolStakCircularList<T> {

    private FoolstakNode<T> first;
    private FoolstakNode<T> last;
    private int size;

    public void addFirst(T value){
        if(first == null){
            first = new FoolstakNode<>(value);
            last = first;
        } else{
                FoolstakNode node = new FoolstakNode(value);
                node.setNext(first);
                first = node;
        }
    }

    public void addAtIndex(int index, T value){
        if(index > getSize()){
            System.out.println("Invalid index");
        }
        if(index == 0){
            addFirst(value);
        } else{
            if(first == last){
                FoolstakNode node = new FoolstakNode(value);
                node.setNext(first);
                first = node;
                last.setNext(first);
            } else{
                if(index == getSize()){
                    addLast(value);
                }
                int i = 0;
                FoolstakNode node = first;
                while(i != index-1){
                    node = node.getNext();
                    i++;
                }
                FoolstakNode nodeToBeAdded = new FoolstakNode(value);
                nodeToBeAdded.setNext(node.getNext());
                node.setNext(nodeToBeAdded);
            }
        }
    }

    private void addLast(T value) {

    }

    private int getSize() {
        int size = 0;
        if(first == last){
            this.size = 1;
            return 1;
        }
        FoolstakNode<T> node = first;
        while(node != last){
            node = node.getNext();
            size++;
        }
        this.size = size;
        return size;
    }

    public void deleteAtIndeX(int index){

    }

    public int find(T value){
        return 0;
    }

    public void print(){

    }
}
