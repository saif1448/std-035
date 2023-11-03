package org.example.exerciseproblems;

import java.util.ArrayList;
import java.util.List;

public class CountingVowels {
    public static int countVowels(String inputString){
        int counter = 0;
        ArrayList<Character> vowels = new ArrayList<>(List.of('a', 'e', 'i', 'o', 'u'));
        for(int i=0; i<inputString.length(); i++){
            char c = inputString.toLowerCase().charAt(i);
            if(vowels.contains(c)){
                counter++;
            }
        }
        return counter;
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


//        Write a Java method to count all vowels in a string

        int res = countVowels("IT IS");
        System.out.println(res);

    }
}
