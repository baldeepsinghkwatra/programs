/**
 * ****************************************************************************
 *
 * Copyright (c) 2019, BSK Technologies and/or its affiliates. All rights
 * reserved.
 * ___________________________________________________________________________________
 *
 *
 * NOTICE: All information contained herein is, and remains the property of
 * BSK and its suppliers,if any. The intellectual and technical concepts
 * contained herein are proprietary to BSK Technologies. and its suppliers and
 * may be covered by us and Foreign Patents, patents in process, and are
 * protected by trade secret or copyright law. Dissemination of this information
 * or reproduction of this material is strictly forbidden unless prior written
 * permission is obtained from BSK Technologies
 */
package xyz.baldeep.sort;

import java.util.Arrays;

/**
 *
 * @author baldeepsinghkwatra
 */
class SelectionSort {

    static void sort(int arr[]) {
        int length = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < length - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < length; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String args[]) {
        int arr[] = {3, 60, 35, 2, 45, 320, 5};
        System.out.println("Array Before Selection Sort: " + Arrays.toString(arr));
        sort(arr);
        System.out.println("Array After Selection Sort: " + Arrays.toString(arr));
    }
}
