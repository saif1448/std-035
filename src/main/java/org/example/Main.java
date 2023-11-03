package org.example;

import org.example.exerciseproblems.CalculatePolygonArea;
import org.example.exerciseproblems.CountingWords;
import org.example.exerciseproblems.SummationOfDigits;
import org.example.exerciseproblems.TirangleAreaCalculation;

import java.io.BufferedReader;
import java.io.Externalizable;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.sql.SQLOutput;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        CalculatePolygonArea ca = new CalculatePolygonArea();

        double res = ca.calculateSquareArea(4);

        System.out.println(res);

    }

}