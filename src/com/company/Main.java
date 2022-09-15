package com.company;

import java.sql.Array;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

//an string contain all aplhabets more or more than one....
//create an array for 26 aplabets...
//then get string remove spaces also convert to uppercase
//formula int index = b[i] - 65; means i=0 ,a[i] = A, A=65 as per formula A-65 = 0 so b[index] = 0
// b[index] so b[0] become 1
// if data of array a all i.e 0 to 25 (alphabet 26) is 1 the paragram else any one of 0 then paragram
public class Main {


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s = sc.nextLine();


        s = s.replace(" ","");

        s= s.toUpperCase();
        char b[] = s.toCharArray();
        int size = s.length();

        int[] a = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};


       int i =0;
       while (i != size ){
           int index = b[i] - 65;
           a[index] = 1;

           i++;
       }
       int j =0;
       while (j != 26){
           if(a[j] == 1 ){
               j++;

           }
           else{
               System.out.println("not an pangram");
               System.exit(0);
           }
       }
        System.out.println("its an pangram");
    }
}







