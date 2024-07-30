package com.mithun.algomap;
import java.util.*;
public class romanToInteger {
    public static void main(String[] args) {
        String s ="III";
        int output = 0;
        Map<Character,Integer> arr = new HashMap<Character, Integer>();
        arr.put('I',1);
        arr.put('V',5);
        arr.put('X',10);
        arr.put('L',50);
        arr.put('C',100);
        arr.put('D',500);
        arr.put('M',1000);

        for(int i=0;i<s.length();i++){
            if(i < s.length() - 1 && arr.get(s.charAt(i)) < arr.get(s.charAt(i + 1))){
                output-=arr.get(s.charAt(i));
            }
            else {
                output+=arr.get(s.charAt(i));
            }
        }
        System.out.println(output);
    }
}
