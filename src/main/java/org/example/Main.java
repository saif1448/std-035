package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

       Vegetables veg = new Vegetables("potato", "brown", 1.24, 0.35, "watery", 2.67);

        System.out.println(veg.getName().toLowerCase().startsWith("p"));


    }
}