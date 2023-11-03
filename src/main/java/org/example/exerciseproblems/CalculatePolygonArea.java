package org.example.exerciseproblems;

public class CalculatePolygonArea {
    public double calculateRectangleArea(int length, int width){
        return length * width;
    }
    public double calculateSquareArea(int length){
        RectangleAreaCalculation ra = new RectangleAreaCalculation();
        double res = ra.calculateRectangleArea(length, length);
        return res;
    }

    public double calculateTrianlgeArea(int base, int height){
        return 0.5 * base * height;
    }
}
