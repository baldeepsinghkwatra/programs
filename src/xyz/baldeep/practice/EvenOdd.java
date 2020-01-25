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

import java.util.HashMap;
import java.util.Map;

/**
 * Print even odd without using if switch or ternary operator for a given number
 *
 * @author baldeepsinghkwatra
 */
public class EvenOdd {

    public static void main(String[] args) {
        int n = 6;
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "Even");
        map.put(1, "Odd");
        System.out.println(map.get(n % 2));
    }
}
