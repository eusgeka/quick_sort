/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.raspi.noobs.quick.sort;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author eusgeka
 */
public class QuickSort {

    private final Logger LOGGER = LoggerFactory.getLogger(QuickSort.class);

    public QuickSort() {
        LOGGER.info("New QuickSort object");
    }

    /**
     *
     * @param arr
     * @param begin
     * @param end
     * @param useMiddleElementAsPivot
     */
    public void quickSort(int arr[], int begin, int end, boolean useMiddleElementAsPivot) {
        if (useMiddleElementAsPivot) {
            LOGGER.info("QuickSort and use middle element as pivot {}", useMiddleElementAsPivot);
            LOGGER.info("Original array of integers {}", arr);
            quickSortMiddleElementAsPivot(arr, begin, end);
            LOGGER.info("After sorting id done array of integers {}", arr);
        } else {
            LOGGER.info("QuickSort and use middle element as pivot {}", useMiddleElementAsPivot);
            LOGGER.info("Original array of integers {}", arr);
            quickSortLastElementAsPivot(arr, begin, end);
            LOGGER.info("After sorting id done array of integers {}", arr);
        }
    }

    /**
     * Quick Sort. Use middle element as pivot.
     *
     * @param arr
     * @param low
     * @param high
     */
    private void quickSortMiddleElementAsPivot(int[] arr, int low, int high) {
        if (arr == null || arr.length == 0) {
            return;
        }

        if (low >= high) {
            return;
        }

        // pick the pivot
        int middle = low + (high - low) / 2;
        int pivot = arr[middle];

        // make left < pivot and right > pivot
        int i = low, j = high;
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }

            while (arr[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        // recursively sort two sub parts
        if (low < j) {
            quickSortMiddleElementAsPivot(arr, low, j);
        }

        if (high > i) {
            quickSortMiddleElementAsPivot(arr, i, high);
        }
    }

    /**
     * Quick Sort. Use last element as pivot.
     *
     * @param arr
     * @param begin
     * @param end
     */
    private void quickSortLastElementAsPivot(int arr[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSortLastElementAsPivot(arr, begin, partitionIndex - 1);
            quickSortLastElementAsPivot(arr, partitionIndex + 1, end);
        }
    }

    /**
     * Partition helper for the quickSortLastElementAsPivot method
     *
     * @param arr
     * @param begin
     * @param end
     * @return
     */
    private int partition(int arr[], int begin, int end) {
        int pivot = arr[end];
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = swapTemp;

        return i + 1;
    }
}
