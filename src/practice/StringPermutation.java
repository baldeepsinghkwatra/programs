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

/**
 *
 * @author Baldeep Singh Kwatra
 */
public class StringPermutation {

    public static void main(String args[]) {
        permutation("GOD");
    }

    /* * A method exposed to client to calculate permutation of String in Java. */
    public static void permutation(String input) {
        permutation("", input);
    }

    /* * Recursive method which actually prints all permutations * of given String, 
        but since we are passing an empty String 
        * as current permutation to start with, 
        * I have made this method private and didn't exposed it to client. */
    private static void permutation(String perm, String word) {
        if (word.isEmpty()) {
            System.out.println(perm + word);
        } else {
            for (int i = 0; i < word.length(); i++) {
                permutation(perm + word.charAt(i), word.substring(0, i) + word.substring(i + 1, word.length()));
            }
        }
    }
}
