/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xyz.baldeep.stream;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author baldeep
 */
public class StreamList {
 
    public static void main(String[] args) {
        List<String> emp=Arrays.asList("Arun","Mahesh","Suresh");
        emp.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
