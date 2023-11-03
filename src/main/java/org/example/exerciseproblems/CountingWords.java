package org.example.exerciseproblems;

public class CountingWords {
    public static int countWords(String inputStr){
        int counter = 0;
        for(int i = 0; i< inputStr.length(); i++){
            char c = inputStr.charAt(i);
            if(c == ' '){
                counter++;
            }
        }

        return counter + 1;
    }
    public static void main(String[] args) {

        int res = countWords("giving a simple sentence adding other new words");

        System.out.println(res);

    }
}
