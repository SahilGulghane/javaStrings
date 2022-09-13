package com.company;
//to calculate the length of string using built in methode also user defined...
//steps
//1.calculate terminating condition ie null refer line13....
//2. convert string to character array refer line15...
//3.initialize loop from 0 to n till checking null character found....

public class Main {

    public static void main(String[] args) {
        String x ="hello i am tanisha";
        // concat() is the function used to add data to end of string...
        String z = x.concat("\0");
        // toChaArray() is methode to convert string to array...
        char y[] = z.toCharArray();
        int i = 0;
        int count = 0 ;
        // checking till null value....
        while(y[i] != 00)

        {
          count++;
          i++;
        }
        System.out.println("the length of string "+count);
        System.out.println("length of string using builtin methode "+x.length() );
    }
}
