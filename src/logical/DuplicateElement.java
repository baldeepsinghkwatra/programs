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
package logical;

/**
 * Find one number is there in the array that is occuring twice, Write a
 * optimized code to find that element in the array.
 *
 * @author baldeepsinghkwatra
 */
public class DuplicateElement {

    static void printRepeating(int arr[]) {
        int size = arr.length;
        int count[] = new int[size];

        System.out.print("Repeated elements are : ");
        for (int i = 0; i < size; i++) {
            if (count[arr[i]] == 1) {
                System.out.print(arr[i] + " ");
            } else {
                count[arr[i]]++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {4, 2, 4, 5, 2, 3, 1};
        printRepeating(arr);
    }
}
