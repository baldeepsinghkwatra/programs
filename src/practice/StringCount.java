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
import java.util.Set;

/**
 * Count number of occurrences of words in a string
 * @author Baldeep Singh Kwatra
 */
public class StringCount {

    public static void main(String args[]) {

        String value = "This is testing Program testing Program";

        HashMap<String, Integer> map = new HashMap<>();

        for (String t : value.split(" ")) {
            if (map.containsKey(t)) {
                map.put(t, map.get(t) + 1);
            } else {
                map.put(t, 1);
            }
        }
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + ":" + map.get(key));
        }

    }
}
