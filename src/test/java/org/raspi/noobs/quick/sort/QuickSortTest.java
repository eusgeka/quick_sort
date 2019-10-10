/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.raspi.noobs.quick.sort;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author eusgeka
 */
public class QuickSortTest {

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testQuickSortUseMidleElementAsPivot() {
        QuickSort quickSort = new QuickSort();
        int arr[] = {9, 4, 6, 5, 3, 2, 1, 8, 7};
        boolean useMiddleElementAsPivot = true;
        quickSort.quickSort(arr, 0, arr.length - 1, useMiddleElementAsPivot);
        for (int i = 0; i < arr.length - 2; i++) {
            assertTrue(arr[i] <= arr[i + 1]);
        }
    }

    @Test
    public void testQuickSortUseLastElementAsPivot() {
        QuickSort quickSort = new QuickSort();
        int arr[] = {9, 4, 6, 5, 3, 2, 1, 8, 7};
        boolean useMiddleElementAsPivot = false;
        quickSort.quickSort(arr, 0, arr.length - 1, useMiddleElementAsPivot);
        for (int i = 0; i < arr.length - 2; i++) {
            assertTrue(arr[i] <= arr[i + 1]);
        }
    }
}
