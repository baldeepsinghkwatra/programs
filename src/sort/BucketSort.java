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
package sort;

import java.util.Arrays;

/**
 *
 * @author baldeepsinghkwatra
 */
public class BucketSort {

    static int[] sort(int[] sequence, int maxValue) {
        // Bucket Sort
        int[] Bucket = new int[maxValue + 1];
        int[] sorted_sequence = new int[sequence.length];

        for (int i = 0; i < sequence.length; i++) {
            Bucket[sequence[i]]++;
        }

        int outPos = 0;
        for (int i = 0; i < Bucket.length; i++) {
            for (int j = 0; j < Bucket[i]; j++) {
                sorted_sequence[outPos++] = i;
            }
        }

        return sorted_sequence;
    }

    static int maxValue(int[] sequence) {
        int maxValue = 0;
        for (int i = 0; i < sequence.length; i++) {
            if (sequence[i] > maxValue) {
                maxValue = sequence[i];
            }
        }
        return maxValue;
    }

    public static void main(String args[]) {
        int arr[] = {3, 60, 35, 2, 45, 320, 5};
        System.out.println("Array Before Bucket Sort: " + Arrays.toString(arr));
        System.out.println("Array After Bucket Sort: " + Arrays.toString(sort(arr, maxValue(arr))));
    }
}
