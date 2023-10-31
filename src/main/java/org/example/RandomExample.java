package org.example;

import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        Random rand = new Random();
        int number;

        int i = 0;
        while (i < 5){
            number = rand.nextInt(1,7);
            System.out.println(number);
            i++;
        }
    }



}
