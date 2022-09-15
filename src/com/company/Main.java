package com.company;

import java.util.Arrays;
//Anagram is a word or phase formed by rearranging the letters of different word or phase ex (silent - listen)...
// sort both Strings
//check data of both string are same after sorting....
// if true then it is Anagram...
//or false then it is not an Anagram...
// Arrays.sort(array) it helps to sort array...
// Arrays.equal(array1,array2) it helps to check both array are equal…
public class Main {


    public static void main(String[] args) {
       String s = "hello sahil";
       s = s.toLowerCase();
       s.replace(" ","");
       char a[] = s.toCharArray();
        String t = "hello lishr";
        t = t.toLowerCase();
        t.replace(" ","");
        char b[] = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        Boolean x = Arrays.equals(a,b);
        if(x == true){
            System.out.println("is an Anagram");
        }
        else{
            System.out.println("not an Anagram");
        }


    }
}







