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
 *
 * @author baldeepsinghkwatra
 */
public class MissingNumber {
    
// Function to find missing number
    static int getMissingNo(int a[]) {
        int n = a.length + 1; //adding 1 because actual size of array is length +1(for missing number)
        int total = n * (n + 1) / 2;
        for (int i = 0; i < n - 1; i++) {
            total -= a[i];
        }
        return total;
    }

    public static void main(String args[]) {
        int a[] = {6, 1, 3, 5, 2};
        System.out.println(getMissingNo(a));
    }
}
