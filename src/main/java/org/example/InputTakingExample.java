package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputTakingExample {
    public static void main(String[] args) {

//        InputStreamReader ist = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String line;

        try{
            while ((line = bf.readLine()) != null && !line.isEmpty()){

            }
        }catch (Exception e){

        }


        Scanner sc = new Scanner(System.in);

        String ln;
        while ( (ln = sc.nextLine()) != null && !(sc.next().isEmpty())){

        }

    }
}
