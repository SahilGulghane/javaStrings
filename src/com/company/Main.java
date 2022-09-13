package com.company;


// note use each code sepratly...


import java.util.Locale;

public class Main {

    public static void main(String[] args) {


//to check string as palindrome(after reversing also string remains same civic radar racecar)\
//        but there is limitation such as blank spaces in between as well as come upper case and lower case character...
//        how to overcome....
//        step1 replace() is used to replace data of string at once so blank spaces are replaced by no spaces...
//        step 2 either convert complete string in uppercase or lowercase using
//                toLowerCase() and to toUppercase() methode.....
        String st = "too hot to Hoot";
        st = st.replace(" ","");

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
                System.exit(0);

            }
            else {
                continue;
            }

        }
        System.out.println("palindrome");








    }
}
