package org.example.exerciseproblems;

public class SummationOfDigits {

    public int sumOfDigits(int num){
        int sum = 0;
        while (num != 0){
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;
    }
}
