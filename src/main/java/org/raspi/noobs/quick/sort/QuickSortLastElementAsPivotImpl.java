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
public class QuickSortLastElementAsPivotImpl implements QuickSort {

    private final Logger LOGGER = LoggerFactory.getLogger(QuickSortLastElementAsPivotImpl.class);

    public QuickSortLastElementAsPivotImpl() {
        LOGGER.info("New QuickSort object");
    }

    /**
     * Quick Sort. Use last element as pivot.
     *
     * @param arr
     * @param begin
     * @param end
     */
    @Override
    public void quickSort(int arr[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, end);
        }
    }

    /**
     * Partition helper for the quickSort method
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
