package com.foolstak.linkedlist;

import java.util.Objects;

public class FoolstakNode<T> {

    private T value;
    private FoolstakNode next;

    public FoolstakNode(T value) {
        this.value = value;
    }

    public FoolstakNode(){

    }
    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public FoolstakNode getNext() {
        return next;
    }

    public void setNext(FoolstakNode next) {
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FoolstakNode<?> that = (FoolstakNode<?>) o;
        return Objects.equals(value, that.value) &&
                Objects.equals(next, that.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, next);
    }
}
