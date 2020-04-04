package com.foolstak.sorting;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionSortTest {

    @Test
    public void testInsertionSortSortsAscending(){
        int[] arrayTrial = {23, 99,102,11,45,63,29,67,87,19,12,34,76,25,23};
        int[] sortedArray = InsertionSort.sort(arrayTrial);
        for(int i = 0; i < sortedArray.length; i++) {
            System.out.println(sortedArray[i]);
        }
        Assert.assertEquals(arrayTrial.length, sortedArray.length);
    }

}