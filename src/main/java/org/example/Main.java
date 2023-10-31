package org.example;

import java.io.BufferedReader;
import java.io.Externalizable;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.sql.SQLOutput;
import java.util.*;

public class Main {

    public static int findTheBiggestNumber(int a, int b, int c){
        int result;
        if(a > b){
            if(a > c){
                System.out.println(a + " is the biggest");
                result = a;
            }
            else{
                System.out.println(c + " is the biggest");
                result = c;
            }
        }
        else{
            if(b > c){
                System.out.println(b + " is the biggest");
                result = b;
            }
            else{
                System.out.println(c + " is the biggest");
                result = c;
            }

        }

        return result;

    }

    public static void main(String[] args) {
//        HashMap<String, Integer> hashMap = new HashMap<>(Map.of("A",1, "B",2, "C",3));
//
//        for (Map.Entry<String, Integer> item :
//             hashMap.entrySet()) {
//            System.out.println(item);
//        }
//
//        Iterator<Map.Entry<String, Integer>> itr = hashMap.entrySet().iterator();
//
//        while (itr.hasNext()){
//            Map.Entry<String, Integer> item = itr.next();
//            String key = item.getKey();
//            int val = item.getValue();
//            System.out.println(item);
//        }

        int res = findTheBiggestNumber(40,70,30);
        System.out.println(res);


    }



}