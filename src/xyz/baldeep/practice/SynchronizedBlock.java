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

/**
 * Synchronized block by using anonymous class:
 *
 * @author Baldeep Singh Kwatra
 */
class Table {

    void printTable(int n) {
        synchronized (this) {//synchronized block  
            for (int i = 1; i <= 5; i++) {
                System.out.println(n * i);
                try {
                    Thread.sleep(400);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }//end of the method  
}

public class SynchronizedBlock {

    public static void main(String args[]) {
        final Table obj = new Table();//only one object  

        Thread t1 = new Thread() {
            @Override
            public void run() {
                obj.printTable(5);
            }
        };
        Thread t2 = new Thread() {
            @Override
            public void run() {
                obj.printTable(100);
            }
        };

        t1.start();
        t2.start();
    }
}
