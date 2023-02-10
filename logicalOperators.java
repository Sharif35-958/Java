package com.company;

public class logicalOperators {
    public static void main(String[] args) {
        System.out.println("For logical AND.....");
        boolean a = true;
        boolean b = false;
        if (a && b){
            System.out.println("Y");
        }
        else {
            System.out.println("N");
        }
        System.out.println("For logical OR...");
        if (a || b){
            System.out.println("Y");
        }
        else {
            System.out.println("N");
        }
        System.out.println("For logical NOT....");
        System.out.print("Not(a) is ");
        System.out.println(!a);
        System.out.print("Not(b) is ");
        System.out.println(!b);
    }
}
