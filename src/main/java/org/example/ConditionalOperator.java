package org.example;

import java.util.ArrayList;
import java.util.List;

public class ConditionalOperator {

    public static void main(String[] args) {

        ArrayList<Integer> myList = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));

        for (var value:
                myList) {
            int status;
            if(value % 2 ==0){
                status = 1;
            }
            else {
                status = 0;
            }

            status = value%2 == 0 ? 1 : 0;
        }

    }
}
