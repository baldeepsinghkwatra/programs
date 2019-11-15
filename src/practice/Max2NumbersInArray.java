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
package practice;

import java.util.Arrays;

/**
 *
 * @author Baldeep Singh Kwatra
 */
public class Max2NumbersInArray {

    private static int arr[] = {100, 2, 32, 4, 6, 10, 65, 76, 33, 32};

    public static void main(String args[]) {
        int maxOne = Integer.MIN_VALUE;
        int maxTwo = Integer.MIN_VALUE;
        for (int num : arr) {
            if (maxOne < num) {
                maxTwo = maxOne;
                maxOne = num;
            } else if (maxTwo < num) {
                maxTwo = num;
            }
        }
        System.out.println("Top2NumbersInArray are " + maxOne + " & " + maxTwo);
        sortAndFind(arr);
        System.out.println("Top2NumbersInArray using sortAndFind are --");
    }

    public static void sortAndFind(int arr[]) {
        Arrays.sort(arr);
        System.out.println("practice.Max2NumbersInArray.sortAndFind()" + arr[arr.length - 1]);
        System.out.println("practice.Max2NumbersInArray.sortAndFind()" + arr[arr.length - 2]);
    }
}
