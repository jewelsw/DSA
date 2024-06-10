package com.company;
//time complexity: O(n^2) - quadratic
public class Main {

    public static void main(String[] args) {
	    int[] intArray = {20,35,-15,  7, 55, 1,  -22};

        //starts out with index 0 alr in the sorted partition
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
            //making sure that the value isnt overwritten
            int newElement = intArray[firstUnsortedIndex];

            int i;
            //keep shifting and looking until the front of the array is hit and until the element in the partition
            //is greater than the element we are trying to insert. MOVING DOWN SORTED PARTITION.
            for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
                intArray[i] = intArray[i - 1]; //shifting from left to right
            }

            intArray[i] = newElement; //inserting the element.
        }

        for (int i =0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}
