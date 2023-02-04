package com.company;

public class PrecedenceAssociativity {
    public static void main(String[] args) {
      //  int a= 7*8 - 64/8;
        /*
        =56-64/8
        =56-8
        =48
         */
      //  System.out.println(a);
     //   int b= 64/8 - 9*9;
        /*
        =8- 9*9
        =8-81
        =-73
         */
        int a=5;
        int b=1;
        int c=4;
        int k= (b*b-4*a*c)/2*a;
        System.out.println(k);
    }
}
