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
 * “java” would be printed if String literals (in double quotes) are used, but
 * in the question since character literals has been used, these won’t be
 * concatenated. Therefore After execution of the program, an addition of each
 * equivalent ASCII(Unicode) value of the character will be obtained. Hence the
 * output is 106 + 97 + 118 + 97 = 418
 *
 * @author Baldeep Singh Kwatra
 */
public class Program2 {

    public static void main(String[] args) {
        System.out.println('j' + 'a' + 'v' + 'a');
    }
}
