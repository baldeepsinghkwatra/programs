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
 * Break statement can only be used with loop or switch. So, using break with if
 * statement causes “break outside switch or loop” error.
 *
 * @author Baldeep Singh Kwatra
 */
public class Program1 {

    public static void main(String[] args) {
        if (true) {
            break;
        }
    }
}
