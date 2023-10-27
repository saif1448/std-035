package org.example;

import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        Random rand = new Random();
        for(int i =0; i<5; i++){
            System.out.println(rand.nextInt(100, 200));
        }
    }
}
