package xyz.baldeep.logical;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * Write a function which takes an array and prints the majority element (if it
 * exists), otherwise prints “No Majority Element”. A majority element in an
 * array A[] of size n is an element that appears more than n/2 times (and hence
 * there is at most one such element). Examples :
 *
 * Input : {3, 3, 4, 2, 4, 4, 2, 4, 4} Output : 4 * Input : {3, 3, 4, 2, 4, 4,
 * 2, 4} Output : No Majority Element
 *
 * @author baldeep
 */
public class MajorityElement {

    public static String getMajorityElement(int arr[]) {
        HashMap<Integer, Integer> counterMap = new HashMap<>();
        for (int item : arr) {
            if (counterMap.containsKey(item)) {
                counterMap.put(item, counterMap.get(item) + 1);
            } else {
                counterMap.put(item, 1);
            }
        }

        int majorityArrSize = arr.length / 2;
        for (Map.Entry<Integer, Integer> entry : counterMap.entrySet()) {
            if (entry.getValue() > majorityArrSize) {
                return "MajorityElement " + entry.getKey();
            }
        }
        return "No Majority Element";
    }

    public static void main(String[] args) {
        int arr[] = new int[]{3, 3, 4, 2, 4, 4, 2, 4, 4};
        System.out.println(getMajorityElement(arr));
    }
}
