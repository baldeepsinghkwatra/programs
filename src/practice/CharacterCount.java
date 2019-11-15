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

import java.util.HashMap;

/**
 *
 * @author Baldeep Singh Kwatra
 */
public class CharacterCount {
    
    private static final String value = "Hello this my String and I have to count occurrences";
    
    public static void main(String args[]) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : value.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        for (Character ch : map.keySet()) {
            System.out.println(ch + ":" + map.get(ch));
            
        }
    }
}
