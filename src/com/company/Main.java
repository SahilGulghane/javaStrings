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
        System.out.println("enter the character you want to delete from string");
        char key = sc.next().charAt(0);
        int i =0;
        String ns = "";
        while (i != y.length){

            if(y[i] != key){
                ns = ns+y[i];
            }i++;
        }
        System.out.println(ns);

    }
}