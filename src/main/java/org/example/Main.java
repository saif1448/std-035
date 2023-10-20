package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> arr = new ArrayList<>();

        arr.add(10.0);
        arr.add(20.0);
        arr.add(30.0);
        arr.add(40.0);
        arr.add(50.0);

        arr.remove(2);

        System.out.println(arr);




    }
}