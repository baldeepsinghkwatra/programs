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
package xyz.baldeep.practice;

/**
 *
 * @author Baldeep Singh Kwatra
 */
public class ArmstrongNumber {

    public static void main(String ars[]) {
        int num = 153;
        int temp = num;
        int remainder = 0;
        int cube = 0;
        while (num > 0) {
            remainder = num % 10;
            num = num / 10;
            cube += remainder * remainder * remainder;
        }
        if (cube == temp) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}
