package com.company;

import  java.util.Scanner;
// following function will convert string into lower upper upperincludespace upper1stalphabet


import java.util.Locale;
class Operation {
    //this function will convert provided string into lowercase without giving blank spaces
    public void onlylower() {
        Scanner sc = new Scanner(System.in); //System.in is a standard input stream
        System.out.print("Enter a string: ");
        String st = sc.nextLine();
        st = st.replace(" ", "");
        char y[] = st.toCharArray();
        int size = st.length();
        int i = 0;
        while (i != size) {
            if (y[i] >= 65 && y[i] <= 90) {
                y[i] = (char) (y[i] + 32);
                i++;
            } else if (y[i] >= 97 && y[i] <= 122) {
                y[i] = y[i];
                i++;
            }


        }
        System.out.println("entered string: " + st);
        System.out.println(y);

    }

// this function will convert string into uppercase removing blank spaces
    public void onlyupper() {
        Scanner sc = new Scanner(System.in); //System.in is a standard input stream
        System.out.print("Enter a string: ");
        String st = sc.nextLine();
        st = st.replace(" ", "");
        char y[] = st.toCharArray();
        int size = st.length();
        int i = 0;
        while (i != size) {
            if (y[i] >= 65 && y[i] <= 90) {
                y[i] = y[i];
                i++;
            } else if (y[i] >= 97 && y[i] <= 122) {

                y[i] = (char) (y[i] - 32);
                i++;
            }


        }
        System.out.println("entered string: " + st);
        System.out.println(y);

    }
//this function will covert string into uppercase considering blank spaces
    public void onlyupperwithoutreplace() {
        Scanner sc = new Scanner(System.in); //System.in is a standard input stream
        System.out.print("Enter a string: ");
        String st = sc.nextLine();

        char y[] = st.toCharArray();
        int size = st.length();
        int i = 0;
        while (i != size) {
            if (y[i] >= 65 && y[i] <= 90) {
                y[i] = y[i];
                i++;
            } else if (y[i] >= 97 && y[i] <= 122) {

                y[i] = (char) (y[i] - 32);
                i++;
            }
            else if(y[i] == 32){
                y[i] = y[i];
                i++;
            }


        }
        System.out.println("entered string: " + st);
        System.out.println(y);

    }

// this function will convert 1st alphabet of word in to upper case...
    public void onlyupper1staplhabet() {
        Scanner sc = new Scanner(System.in); //System.in is a standard input stream
        System.out.print("Enter a string: ");
        String st = sc.nextLine();

        char y[] = st.toCharArray();
        int size = st.length();
        int i = 0;
        while (i != size) {
                if(y[i] == 32 ) {
                   y[i+1] = (char)(y[i+1] - 32);

                }i++;



        }
        System.out.println("entered string: " + st);
        System.out.println(y);

    }
}




public class Main {


    public static void main(String[] args) {
        Operation st = new Operation();
        st.onlylower();
        st.onlyupper();
        st.onlyupperwithoutreplace();
        st.onlyupper1staplhabet();

    }
}







