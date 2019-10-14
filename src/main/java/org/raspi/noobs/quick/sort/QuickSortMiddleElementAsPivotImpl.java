/* 
 * Copyright 2019 Epsilon AgentX <epsilonagentx at gmail.com>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.raspi.noobs.quick.sort;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Epsilon AgentX
 */
public class QuickSortMiddleElementAsPivotImpl implements QuickSort {

    private final Logger LOGGER = LoggerFactory.getLogger(QuickSortMiddleElementAsPivotImpl.class);

    public QuickSortMiddleElementAsPivotImpl() {
        LOGGER.info("New QuickSort object");
    }

    /**
     * Quick Sort. Use middle element as pivot.
     *
     * @param arr
     * @param low
     * @param high
     */
    public void quickSort(int[] arr, int low, int high) {
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
            quickSort(arr, low, j);
        }

        if (high > i) {
            quickSort(arr, i, high);
        }
    }
}
