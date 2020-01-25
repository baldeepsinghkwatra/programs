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

import java.util.ArrayList;
import java.util.List;

/**
 * Flaten a list having sub-lists
 * @author baldeepsinghkwatra
 */
public class FlatenList {

    public static void main(String[] args) {
        List list = new ArrayList() {
            {
                add("String");
                add(new ArrayList() {
                    {
                        add("Child");
                    }
                });
                add(1);
                add(2);
                add(5.5);
            }
        };
        System.out.println("practice.FlatenList.main()" + flaten(list, new ArrayList()));
    }

    public static List flaten(List list, List object) {
        for (Object l : list) {
            if (l instanceof List) {
                flaten((List)l, object);
            } else {
                object.add(l);
            }
        }
        return object;
    }
}
