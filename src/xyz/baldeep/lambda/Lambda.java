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
public class Lambda {

    public static void main(String[] args) {
        Greeting greetingFunction = () -> System.out.println("Hi From Lambda");//using lambda to provide implementation of function interface
        greetingFunction.greet();
        Greeting innerClass = new Greeting() {//using inner class to provide implementation
            @Override
            public void greet() {
                System.out.println("Hello From Inner Class");
            }
        };
        innerClass.greet();
    }
}

@FunctionalInterface
interface Greeting {

    public void greet();
}
