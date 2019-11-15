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
public class StudentCloning implements Cloneable {

    int rollno;
    String name;

    StudentCloning(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    public static void main(String args[]) {
        try {
            StudentCloning s1 = new StudentCloning(101, "amit");
            StudentCloning s2 = (StudentCloning) s1.clone();

            System.out.println(s1.rollno + " " + s1.name);
            System.out.println(s2.rollno + " " + s2.name);

        } catch (CloneNotSupportedException c) {
        }

    }
}
