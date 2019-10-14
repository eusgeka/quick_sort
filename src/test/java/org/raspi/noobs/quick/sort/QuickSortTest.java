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

import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Epsilon AgentX
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
        QuickSort quickSort = new QuickSortMiddleElementAsPivotImpl();
        int arr[] = {9, 4, 6, 5, 3, 2, 1, 8, 7};
        LOGGER.debug("Before Quick Sort {}", arr);
        quickSort.quickSort(arr, 0, arr.length - 1);
        LOGGER.debug("After Quick Sort {}", arr);
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
        QuickSort quickSort = new QuickSortMiddleElementAsPivotImpl();
        int arr[] = {9, 4, 6, 5, 3, 2, 1, 8, 7};
        LOGGER.debug("Before Quick Sort {}", arr);
        quickSort.quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length - 2; i++) {
            assertTrue(arr[i] <= arr[i + 1]);
        }
        LOGGER.debug("After Quick Sort {}", arr);
        LOGGER.info("<--------- End ---------------->");
        LOGGER.info(" ");
        LOGGER.info(" ");
    }
}
