package org.example.exerciseproblems;

public class SquareAreaCalculation {

    public double calculateSquareArea(int length){
        RectangleAreaCalculation ra = new RectangleAreaCalculation();
        double res = ra.calculateRectangleArea(length, length);
        return res;
    }
}
