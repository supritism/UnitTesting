package Junit;/*
Step 8: Comparing Arrays in Junit tests.
assertEquals vs assertArrayEquals.
 */

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ComparingArraysTest {

    /*
    Step 8 : Comparing arrays in Junit tests - use assertArrayEquals instead of assertEquals
     */
    @Test
    public void testArraySort_RandomArray() {
        int[] numbers = {12, 3, 4, 1};
        int[] expected = {1, 3, 4, 12};

        Arrays.sort(numbers);
        //Assert.assertEquals(expected,numbers); //This doesnt work for Arrays!
        Assert.assertArrayEquals(expected, numbers);
    }

    /*
    Step 9 : Testing Exceptions in Junit tests
    Using the @Test(expected = <WhatExceptionYouWant>.class) only when you want to test or are expecting to catch an exception.
     */
    @Test
    public void testArraySort_NullArray_NormalWay() {
        int[] numbers = null;
        try {
            Arrays.sort(numbers);
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }

    //Below test : when a NullPointerException is thrown test will succeed else it will fail
    @Test(expected = NullPointerException.class)
    public void testArraySort_NullArray_JUnitWay() {
        int[] numbers = null;
        Arrays.sort(numbers);
    }

    /*
    Step 10 : Testing performance of Arrays

    The below example will fail if we give (timeout = 10) as the array needs more than 10 ms to sort all the 10 iterations.This is
    how we can check performance in junit using (timeout = 100)
     */
    @Test(timeout = 100)
    public void testArraySort_Performance() {
        int array[] = {12, 23, 4, 13};
        for (int i = 1; i <= 10; i++) {
            array[0] = i;
            Arrays.sort(array);

            for (int j : array) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}