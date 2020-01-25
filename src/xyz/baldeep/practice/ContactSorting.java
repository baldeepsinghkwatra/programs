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
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Baldeep Singh Kwatra
 */
public class ContactSorting {

    private String name;
    private String phone;

    public ContactSorting(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public ContactSorting() {
    }

    @Override
    public String toString() {
        return this.name + " : " + this.phone;
    }

    public static Comparator<ContactSorting> COMPARE_BY_PHONE = new Comparator<ContactSorting>() {
        @Override
        public int compare(ContactSorting one, ContactSorting other) {
            return one.phone.compareTo(other.phone);
        }
    };

    public static Comparator<ContactSorting> COMPARE_BY_NAME = new Comparator<ContactSorting>() {
        @Override
        public int compare(ContactSorting one, ContactSorting other) {
            return one.name.compareTo(other.name);
        }
    };

    public static void main(String args[]) {
        ContactSorting c1 = new ContactSorting("Baldeep", "1234567");
        ContactSorting c2 = new ContactSorting("Aman", "987654");
        ContactSorting c3 = new ContactSorting("Anshul", "987654");
        List<ContactSorting> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        System.out.println("Non sorted: practice.ContactSorting.main()" + list);
        Collections.sort(list, ContactSorting.COMPARE_BY_NAME);
        System.out.println("Name: practice.ContactSorting.main()" + list);
        Collections.sort(list, ContactSorting.COMPARE_BY_PHONE);
        System.out.println("Phone: practice.ContactSorting.main()" + list);
    }
}
