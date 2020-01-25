/**
 * ****************************************************************************
 *
 * Copyright (c) 2019, Contata Solutions and/or its affiliates. All rights
 * reserved.
 * ___________________________________________________________________________________
 *
 *
 * NOTICE: All information contained herein is, and remains the property of
 * Contata and its suppliers,if any. The intellectual and technical concepts
 * contained herein are proprietary to Contata Solutions. and its suppliers and
 * may be covered by us and Foreign Patents, patents in process, and are
 * protected by trade secret or copyright law. Dissemination of this information
 * or reproduction of this material is strictly forbidden unless prior written
 * permission is obtained from Contata Solutions
 */
package xyz.baldeep.output.misc;

/**
 *
 * We always thought that whenever two object references are compared using
 * “==”, it always evaluates to “false”. But here Integer caching changes the
 * results. Integer class has a caching range of -128 to 127. Whenever a number
 * is between this range and autoboxing is used, it assigns the same reference.
 * That’s why for value 100, both num1 and num2 will have the same reference,
 * but for the value 500 (not in the range of -128 to 127), num3 and num4 will
 * have different reference.
 *
 * @author Baldeep Singh Kwatra
 */
public class Program3 {

    public static void main(String[] arr) {

        for (int i = 0; i < 1_0; i++) {
            System.out.println(i);
        }
        Integer num1 = 100;
        Integer num2 = 100;
        Integer num3 = 500;
        Integer num4 = 500;

        if (num1 == num2) {
            System.out.println("num1 == num2");
        } else {
            System.out.println("num1 != num2");
        }
        if (num3 == num4) {
            System.out.println("num3 == num4");
        } else {
            System.out.println("num3 != num4");
        }
    }
}
