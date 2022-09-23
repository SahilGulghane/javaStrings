package com.company;


// note use each code sepratly...


import java.util.Locale;
import java.util.Scanner;
class Check{
    public void ch(){

              Scanner sc = new Scanner(System.in);
              String st = sc.nextLine();
                st = st.toLowerCase();
                char y[] = st.toCharArray();
                int size = st.length();
                char z[] = new char[size];
                int i = 0;
                int j ;
                for(j = size-1;j>=0 ;j--){
                    z[i] = y[j];


                    i++;
                }
                int k ;
                for (k = 0 ; k<st.length();k++ ){
                    if(y[k] != z[k]){
                        System.out.println("not palindrome");
                        return;

                    }
                    else {
                        continue;
                    }

                }
                System.out.println("palindrome");







    }

}

public class Main {

    public static void main(String[] args) {



        Check one = new Check();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i =0;
        while (i != n){
            one.ch();
            i++;
        }





    }
}