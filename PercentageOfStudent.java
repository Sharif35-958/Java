package com.company;
import java.util.Scanner;
public class PercentageOfStudent {
    public static void main(String[] args) {
        System.out.println("Taking Input from the Student.");
        Scanner s= new Scanner(System.in);
        System.out.println("Enter Subject 1 Number :");
        int a= s.nextInt();
        System.out.println("Enter Subject 2 Number : ");
        int b= s.nextInt();
        System.out.println("Enter Subject 3 Number :");
       int c= s.nextInt();
   System.out.println("Enter Subject 4 Number : ");
        int d= s.nextInt();
        System.out.println("Enter Subject 5 Number :");
        int e= s.nextInt();
        float avg=(a+b+c+d+e)/5;
        System.out.print(avg+"%");
       // System.out.println("%");
    }
}
