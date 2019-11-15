/**
 * ****************************************************************************
 *
 * Copyright (c) 2019, Contata Solutions and/or its affiliates. All rights
 * reserved.
 * ___________________________________________________________________________________
 *
 *
 * NOTICE: All information contained herein is, and remains the property of
 * Contata and its suppliers,if any. The intellectual and technical concepts
 * contained herein are proprietary to Contata Solutions. and its suppliers and
 * may be covered by us and Foreign Patents, patents in process, and are
 * protected by trade secret or copyright law. Dissemination of this information
 * or reproduction of this material is strictly forbidden unless prior written
 * permission is obtained from Contata Solutions
 */
package output.overloading;

/**
 * As we know that we can assign null to any object, so doesn’t compiler
 * complains about this program? According to java specs, in case of
 * overloading, compiler picks the most specific function. Obviously String
 * class is more specific than Object class, hence it will print “String impl”.
 * What if we have another method in the class like the one commented below:
 *
 * “The method foo(String) is ambiguous for the type Test” because String and
 * StringBuffer, none of them are more specific to others. A method is more
 * specific than another if any invocation handled by the first method could be
 * passed on to the other one without a compile-time type error. We can pass
 * String as a parameter to Object argument and String argument but not to
 * StringBuffer argument method.
 *
 * @author Baldeep Singh Kwatra
 */
public class Program1 {

    public static void main(String[] args) {
        foo(null);
    }

    public static void foo(Object o) {
        System.out.println("Object impl");
    }

    public static void foo(String s) {
        System.out.println("String impl");
    }
//if you uncomment then compile time error will come - for the method being ambiguous
//    public static void foo(StringBuffer s) {
//        System.out.println("String impl");
//    }
}
