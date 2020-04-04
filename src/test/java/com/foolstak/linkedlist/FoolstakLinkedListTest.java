package com.foolstak.linkedlist;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class FoolstakLinkedListTest {

    FoolstakLinkedList<Integer> linkedList;

    @Before
    public void setup(){
        linkedList = new FoolstakLinkedList<>();
//        FoolstakNode<Integer> node1 = createNode(12);
//        FoolstakNode<Integer> node2 = createNode(18);
//        FoolstakNode<Integer> node3 = createNode(9);
//        FoolstakNode<Integer> node4 = createNode(2);
//        FoolstakNode<Integer> node5 = createNode(5);
        linkedList.addFirst(12);
        linkedList.addLast(18);
        linkedList.addLast(9);
        linkedList.addFirst(5);
        linkedList.addLast(2);
    }

    private FoolstakNode<Integer> createNode(int i) {
        FoolstakNode<Integer> node = new FoolstakNode<>();
        node.setValue(i);
        node.setNext(null);
        return node;
    }

    @Test
    public void testSize(){
        Assert.assertThat(linkedList.size(), is(5));
    }

    @Test
    public void getFirstReturnsFirstValue(){
        Assert.assertThat(linkedList.getFirst().getValue(), is(5));
        Assert.assertThat(linkedList.getFirstValue(), is(5));
    }

    @Test
    public void getLastReturnsLastValue(){
        Assert.assertThat(linkedList.getLast().getValue(), is(2));
        Assert.assertThat(linkedList.getLastValue(), is(2));
    }

    @Test
    public void deleteFirstDeletesFirstValue(){
        linkedList.deleteFirst();
        Assert.assertThat(linkedList.getFirstValue(), is(12));
        Assert.assertThat(linkedList.size(), is(4));
    }

    @Test
    public void deleteLastDeletesLastValue(){
        linkedList.deleteLast();;
        Assert.assertThat(linkedList.getLastValue(), is(9));
        Assert.assertThat(linkedList.size(), is(4));
    }

    @Test
    public void containsReturnsCorrectValue(){
        Assert.assertTrue(linkedList.contains(5));
        Assert.assertFalse(linkedList.contains(15));
        Assert.assertTrue(linkedList.contains(2));
        Assert.assertFalse(linkedList.contains(67));
    }
}