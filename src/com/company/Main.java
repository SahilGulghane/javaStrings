package com.company;

public class Main {
// split() split methode is used to split string from targeted area also we can give range...
    public static void main(String[] args) {
        // write your code here
//        String s ="Iam the java learner as well as the arth learner";
//        int i =0;
//        int count =0;
//        char y[] = s.toCharArray();
//        while(i!= y.length){
//            if(y[i] == 32){
//               count++;
//                i++;
//            }
//            else{
//                i++;
//            }
//        }
        // last word does not get invole thats why +1
//        System.out.println("no of words in sentence are "+(count+1));
//
        String  s ="Iam the java learner as well as the arth learner";
        String y[] = s.split(" ");
        System.out.println(y.length);
    }
}
