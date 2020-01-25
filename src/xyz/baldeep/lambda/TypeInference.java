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
package xyz.baldeep.lambda;

/**
 *
 * @author Baldeep Singh Kwatra
 */
public class TypeInference {

    public static void main(String[] args) {
        printLambda(s -> s.length());
    }

    public static void printLambda(StringLengthLamba sll) {
        System.out.println(sll.getLength("Hello"));
    }
}

interface StringLengthLamba {

    public int getLength(String s);
}
