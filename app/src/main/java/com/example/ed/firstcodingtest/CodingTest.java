package com.example.ed.firstcodingtest;

import java.util.ArrayList;

/**
 * Created by Ed on 8/29/2017.
 */

public class CodingTest {

    public static void main(String[] args) {

        for(int i = 1; i <=20; i++){
            printFizzBuzz(i);
        }

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("A");
        stringArrayList.add("B");
        stringArrayList.add("A");
        stringArrayList.add("C");
        stringArrayList.add("D");
        stringArrayList.add("B");
        stringArrayList.add("E");

        System.out.println("\n");

        DupStrings(stringArrayList);

    }

    public static void printFizzBuzz(int num){
        String temp = "";
        if(num%3 == 0){
            temp = "Fizz ";
        }
        if(num%5 == 0){
            temp += "Buzz";
        }

        if(num%5 != 0 && num%3 != 0){
            temp = ""+num;
        }

        System.out.println(temp);
    }

    public static void DupStrings(ArrayList<String> s){
        ArrayList<String> temp = new ArrayList<>();
        for (String t: s) {
            if (temp != null){
                if(temp.contains(t)){
                    System.out.println(t);
                }
                else{
                    temp.add(t);
                }
            }
            else {
                temp.add(t);
                System.out.println(t);
            }
        }
    }

}
