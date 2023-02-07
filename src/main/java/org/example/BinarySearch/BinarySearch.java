package org.example.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,10,11,13,14};
        System.out.println(binarySearch(numbers, 0, 9, 10));
    }

    private static int binarySearch(int[] numbers, int left, int right, int number) {
        if (left > right) {
            return -1;
        }
        int mid = (left + right) / 2;
        if (numbers[mid] == number){
            return mid;
        }


        if (numbers[mid] > number){
            return binarySearch(numbers, left, mid -1, number);
        }

        return binarySearch(numbers, mid + 1, right, number);

    }
}
