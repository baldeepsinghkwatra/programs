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
package xyz.baldeep.java8;

/**
 *
 * @author baldeepsinghkwatra
 */
interface Interface1 {

    default void hello() {
        System.out.println("java8.Interface1.hello()");
    }

    static void hi() {
        System.out.println("java8.Interface1.hi()");
    }
}

interface Interface2 {

    default void hello() {
        System.out.println("java8.Interface2.hello()");
    }

    static void hi() {
        System.out.println("java8.Interface2.hi()");
    }
}


class TestInterface1 implements Interface1 {
    public static void main(String[] args) {
        Interface1.hi();
        Interface2.hi();
        new TestInterface1().hello();
        new TestInterface2().hello();
    }
    

}

class TestInterface2 implements Interface1, Interface2 {

    @Override
    public void hello() {
        System.out.println("java8.TestInterface2.hello()");
    }

}
