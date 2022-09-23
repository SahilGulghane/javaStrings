package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        String s ="@hello world my name is sahil ";
        int i =0;
        int count =0;
        char y[] = s.toCharArray();
        while(i != s.length()){
            if(y[i] != ' '){
                if(y[i] >= 'a' && y[i] <= 'z'){
                    count++;
                    i++;


                }
                else{
                    i++;
                }

              }
            else{
                System.out.print(count+" ");

                i++;

            }
        }

    }
}