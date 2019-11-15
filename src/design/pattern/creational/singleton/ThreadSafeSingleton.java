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
package design.pattern.creational.singleton;

/**
 *
 * @author Baldeep Singh Kwatra
 */
public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
    }

    //overhead due to synchronized method
    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }

    //thread safe using double check
    public static ThreadSafeSingleton getInstanceUsingDoubleLocking() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}
