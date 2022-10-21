package com.telran.Homework;
import org.junit.jupiter.api.Test;
import org.junit.Assert;

import static com.telran.Homework.ArrayABCD.collation;
import static org.junit.Assert.*;


class ArrayABCDTest {

    @Test
    void positiveTest1() {
        char[] arr1 = {'A', 'B', 'C', 'D'};
        char[] arr2 = {'D', 'A', 'B', 'C'};
        assertEquals(true, collation(arr1, arr2));
    }

    @Test
    void positiveTest2() {
        char[] arr1 = {'A', 'B', 'C', 'D'};
        char[] arr2 = {'D', 'A', 'B', 'C'};
        assertNotNull(collation(arr1, arr2));
    }

    @Test
    void negativeTest1() {
        char[] arr1 = {'A', 'B', 'C', 'D'};
        char[] arr2 = {'D', 'B', 'A', 'C'};
        Assert.assertNotEquals(true, collation(arr1, arr2));
    }

    @Test
    void negativeTest2() {
        char[] arr1 = {'A', 'B', 'C'};
        char[] arr2 = {'A', 'B', 'C', 'C'};
        Assert.assertNotEquals(true, collation(arr1, arr2));
    }

    @Test
    void negativeTest3() {
        char[] arr1 = {'A', 'B', 'C', 'D'};
        char[] arr2 = {'A', 'B', 'C'};
        Assert.assertNotEquals(true, collation(arr1, arr2));
    }

}