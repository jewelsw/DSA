package com.company;
//time complexity: O(n^2) - quadratic
public class Main {

    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largest = 0; //in unsorted, the largest is at 0: we havent looked yet
            for (int i = 1; i <= lastUnsortedIndex; i++) { //<= because we want to compare it to last as well
                if (intArray[i] > intArray[largest]) {
                    largest = i;
                }
            }

            swap(intArray, largest, lastUnsortedIndex);
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
