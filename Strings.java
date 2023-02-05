package com.company;
import java.util.Scanner;
public class Strings {
    public static void main(String[] args) {
//        String name = new String("Sharif");
//        System.out.print("The Name is : ");
//        System.out.println(name);
        Scanner sc= new Scanner(System.in);
        String st = sc.nextLine();
        System.out.println(st);
        int a=8;
        float b=7.443f;
        System.out.println("The value of a is "+a+ " and the value of b is "+b);
        System.out.printf("The value of a is %d and the value of b is %10.2f\n",a,b);
        System.out.format("The value of a is "+a+ " and the value of b is "+b);
    }
}
