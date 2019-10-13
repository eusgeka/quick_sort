/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.raspi.noobs.quick.sort;

import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author eusgeka
 */
public class QuickSortTest {

    private final Logger LOGGER = LoggerFactory.getLogger(QuickSortTest.class);

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testQuickSortUseMidleElementAsPivot() {
        LOGGER.info(" ");
        LOGGER.info(" ");
        LOGGER.info(" ");
        LOGGER.info("<--------- Start ---------------->");
        LOGGER.info("Test Quick Sort and Use Midle Element As Pivot");
        QuickSort quickSort = new QuickSort();
        int arr[] = {9, 4, 6, 5, 3, 2, 1, 8, 7};
        boolean useMiddleElementAsPivot = true;
        quickSort.quickSort(arr, 0, arr.length - 1, useMiddleElementAsPivot);
        for (int i = 0; i < arr.length - 2; i++) {
            assertTrue(arr[i] <= arr[i + 1]);
        }
        LOGGER.info("<--------- End ---------------->");
        LOGGER.info(" ");
        LOGGER.info(" ");
    }

    @Test
    public void testQuickSortUseLastElementAsPivot() {
        LOGGER.info(" ");
        LOGGER.info(" ");
        LOGGER.info(" ");
        LOGGER.info("<--------- Start ---------------->");
        LOGGER.info("Test Quick Sort Use Last Element As Pivot");
        QuickSort quickSort = new QuickSort();
        int arr[] = {9, 4, 6, 5, 3, 2, 1, 8, 7};
        boolean useMiddleElementAsPivot = false;
        quickSort.quickSort(arr, 0, arr.length - 1, useMiddleElementAsPivot);
        for (int i = 0; i < arr.length - 2; i++) {
            assertTrue(arr[i] <= arr[i + 1]);
        }
        LOGGER.info("<--------- End ---------------->");
        LOGGER.info(" ");
        LOGGER.info(" ");
    }
}
