package com.foolstak.linkedlist;

import java.util.List;

public class FoolstakLinkedList<T> {

    private FoolstakNode<T> first;
    private FoolstakNode<T> last;
    private int size;

    public void addFirst(T value) {
        FoolstakNode<T> node = new FoolstakNode<>();
        node.setValue(value);
        if (first != null) {
            node.setNext(first);
            size++;
        } else {
            node.setNext(null);
            last = node;
            size = 1;
        }
        first = node;
    }

    public void addLast(T value) {
        FoolstakNode<T> node = new FoolstakNode<>();
        node.setValue(value);
        node.setNext(null);
        if (last != null) {
            last.setNext(node);
            last = node;
            size++;
        } else {
            first = node;
            last = node;
            size = 1;
        }
    }

    public void addBefore(FoolstakNode<T> node, T value) {
        FoolstakNode currentNode = first;
        while (currentNode != null) {
            if (currentNode == node) {
                FoolstakNode nodeToBeAdded = new FoolstakNode();
                nodeToBeAdded.setValue(value);
                nodeToBeAdded.setNext(node.getNext());
                node.setNext(nodeToBeAdded);
                size++;
                break;
            }
            node = node.getNext();
        }
    }

    public void deleteFirst() {
        if (size != 1) {
            FoolstakNode nodeToDelete = first;
            first = first.getNext();
            nodeToDelete = null;

        } else {
            first = null;
            last = null;
        }
        size--;
    }


    public void deleteLast() {
        if (size != 1) {

            FoolstakNode nodeToDelete = last;
            FoolstakNode currentNode = first;
            while (currentNode.getNext() != last) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(null);
            last = null;
            last = currentNode;

        } else {

            first = null;
            last = null;

        }

        size--;
    }


    public void delete(FoolstakNode node) {
        FoolstakNode currentNode = first;
        while (currentNode.getNext() != node) {
            currentNode = currentNode.getNext();
        }
        FoolstakNode nodeToDelete = currentNode.getNext();
        currentNode.setNext(currentNode.getNext().getNext());
        nodeToDelete = null;
        size--;
    }

    public T getFirstValue() {
        return first.getValue();
    }

    public T getLastValue() {
        return last.getValue();
    }

    public FoolstakNode<T> getFirst() {
        return first;
    }

    public FoolstakNode<T> getLast() {
        return last;
    }

    public boolean contains(T value) {
        if(first == last){
            if(first.getValue().equals(value)){
                return true;
            }
            return false;
        }
        FoolstakNode currentNode = first;
        while(currentNode != null){
            if(currentNode.getValue().equals(value)) {
                return true;
            }
            currentNode = currentNode.getNext();
        }
        return false;
    }

    public int size() {
        return size;
    }
}
