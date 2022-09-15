package com.company;

import java.util.Locale;
import  java.util.Scanner;
// following function will convert string into lower upper upperincludespace upper1stalphabet
public class Main {


    public static void main(String[] args) {
       String s = "my Name is sahil";


        int size = s.length();
       int i =0 ;
       int vcount = 0;
       int ccount =0;
       int scount = 0;
       s = s.toLowerCase();

       char y[] = s.toCharArray();
       while(i != size){
           if((y[i] >= 'a' && y[i] <= 'z')) {


               if(y[i] == 'a' || y[i] == 'e' || y[i] == 'i' || y[i] == 'o' || y[i] == 'u'){


                   vcount++;




               }
               else{
                   ccount++;



               }


           }
           else{
               scount ++;

           }

i++;

       }
        System.out.println("no of vowels are :" +vcount);
        System.out.println("no of consonants are :" +ccount);
        System.out.println("no of special symbols are are :" +scount);

    }
}







