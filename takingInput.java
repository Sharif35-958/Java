package com.company;
import java.util.Scanner;
public class takingInput {
    public static void main(String[] args) {
        System.out.println("Taking Input From the User");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1 :");
        int a= sc.nextInt();
        System.out.println("Enter Number 2 :");
        int b= sc.nextInt();
        int sum=a+b;
        System.out.println("The Sum of the number is :");
        System.out.println(sum);
        boolean b1=sc.hasNextInt();
        System.out.println(b1);
        System.out.println("Enter a string :");
        String str = sc.nextLine();
        System.out.println(str);


    }
}