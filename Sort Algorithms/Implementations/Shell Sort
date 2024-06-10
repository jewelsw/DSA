package com.company;
//variation and optimized version of insertion sort
//time complexity: O(n^2) worst case - quadratic
public class Main {

    public static void main(String[] args) {
        int[] intArray = {20,35,-15,  7, 55, 1,  -22};

        //looking at elements farther away from each other, so on the last iteration (where it's the same as insertion
        //sort) there's a lot less shifting to do since the elements are more closely in order.
        for (int gap = intArray.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < intArray.length; i++ ) {
                int newElement = intArray[i];
                int j = i;

                while (j >= gap && intArray[j - gap] > newElement) {
                    intArray[j] = intArray[j - gap];
                    j -= gap;
                }
                intArray[j] = newElement;
            }

        }

        for(int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}
