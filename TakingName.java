package com.company;
import java.util.Scanner;
public class TakingName
{
    public static void main(String[] args) {
        System.out.println("Enter your Name: ");
        Scanner s = new Scanner(System.in);
        String str = s.next();
        System.out.println("Hello "+ str +" have a good day.");
    }
}
