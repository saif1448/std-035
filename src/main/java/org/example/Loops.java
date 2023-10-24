package org.example;

public class Loops {
    public static void main(String[] args) {

        int a1[] = {10, 20, 30, 40, 50};
        int a2[] = {60, 70, 80, 90, 20};
        int a3[] = {1, 2, 3, 4, 5};

//     int arr[][] = new int[3][5];
        int arr[][] = {a1, a2, a3};


//     arr[0] = a1;
//     arr[1] = a2;
//     arr[2] = a3;
//
        for (int a[] : arr) {
            for (int val : a) {
                System.out.println(val);
            }
        }
//
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                System.out.println(arr[row][col]);
            }
        }

//     int a[] = {1,2,3,4,5};
//     for(
    }
}
