package com.company;

import java.util.Scanner;

public class Main {

// to check weather string is rotational copy or not
// concat() to attach the given part
// contains() return bool means is a part
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("enter the string");
        String currents = sc.nextLine();
        char y[] =  currents.toCharArray();
        System.out.println("enter the targeted character");
        char target = sc.next().charAt(0);
        System.out.println("enter the letter which want to be replace");
        char key = sc.next().charAt(0);

        int i =0;
        while (i != currents.length()){
            if(y[i] == target){
                y[i] =key;
            }i++;
        }
        System.out.println(y);

    }
}