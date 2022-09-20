package com.company;

public class Main {

// to check weather string is rotational copy or not
// concat() to attach the given part
// contains() return bool means is a part
    public static void main(String[] args) {
        String currents = "aradhya";
        String key = "dhyaara";
        String ns ;
        ns =  currents.concat(currents);
        if(ns.contains(key)){
            System.out.println(ns.contains(key));
            System.out.println("rotational String  ");
        }
        else
        {
            System.out.println("non rotational string");
        }

    }
}