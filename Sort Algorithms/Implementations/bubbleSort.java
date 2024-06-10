package com.company;
//time complexity: O(n^2) - quadratic time complexity
//one of the least efficient sorting algorithms.
public class Main {

    public static void main(String[] args) {
	    int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) { //outer loop
            for (int i = 0; i < lastUnsortedIndex; i++) { //inner loop
                if (intArray[i] > intArray[i + 1]) {
                    swap(intArray, i, i + 1);
                }
            }
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

    }

    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            //no elements to swap
            return;
        }

        int temp = array[i]; //saving value that was in array[i] in temp
        array[i] = array[j]; //assign value of j to array[i]
        array[j] = temp; //assigning temp to array[j]

    }
}
