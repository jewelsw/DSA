package com.company;
//time complexity: O(nlogn) - logarithmic
public class Main {

    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        mergeSort(intArray, 0, intArray.length);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void mergeSort(int[] input, int start, int end) {
        //when we get to a one element array, break out of the recursion
        if (end - start < 2 ) {
            return;
        }

        //partition the array that's passed in
        int mid = (start + end) / 2;
        mergeSort(input, start, mid); //making the left partition(s)
        mergeSort(input, mid, end); //making the right partition(s)
        merge(input, start, mid, end); //merge siblings

    }

    public static void merge(int[] input, int start, int mid, int end) {
        //INCLUSION STEP
        if (input[mid - 1] <= input[mid]) {
            return; //it means that the last element in the left partition is less than first in the right, so the
            //elements in the left are smaller than the right. the merge would equal the original
        }

        int i = start;
        int j = mid;
        int tempIndex = 0; //keeps track of where we are

        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++]; //writes the smaller element into temp
        }

        //handling the remaining elements in the other away which we haven't traversed
        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);
    }
}
