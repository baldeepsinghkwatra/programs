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
 * Program to check if a string is rotated
 *
 * @author baldeepsinghkwatra
 */
public class RotatedString {

    public static boolean isRotated(String str, String rotated) {
        if (str.length() == rotated.length()) {
            str = str.concat(str);
            return str.contains(rotated);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("practice.RotatedString.main()" + isRotated("amazon", "azonam"));
        System.out.println("practice.RotatedString.main()" + isRotated("amazon", "mazona"));
    }
}
