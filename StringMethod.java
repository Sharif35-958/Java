package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;
public class StringMethod {
    public static void main(String[] args) {
        //String name = "Harry";
        Scanner sc= new Scanner(System.in);
        String st= sc.nextLine();
        System.out.println(st);

        int value = st.length();
        System.out.println(value);

        String lowerString = st.toLowerCase();
        //System.out.println(st.toLowerCase());
        System.out.println(lowerString);

        String upperString = st.toUpperCase();
        System.out.println(upperString);

        String NonTrimmedString = "   Sharif   ";
        System.out.println(NonTrimmedString);
        String TrimmedString = NonTrimmedString.trim();
        System.out.println(TrimmedString);

        System.out.println(st.substring(3));
        System.out.println(st.substring(1,5));//start to end mentioned

        //replace
        System.out.println(st.replace('r','p'));
        System.out.println(st.replace("rry","ier"));

        //check starts and end
        System.out.println(st.startsWith("Sha"));
        System.out.println(st.endsWith("rif"));
        // character index
        System.out.println(st.charAt(2));

        //starts from which index

        System.out.println(st.indexOf("ar"));
        //start search from index
        System.out.println(st.indexOf("rryi",4));//if dont match then return -1
//search from last
        System.out.println(st.lastIndexOf("r"));

        //search from last called index
        System.out.println(st.lastIndexOf("rry",7));

        //equal or not

        System.out.println(st.equals("Sharif"));

        //check ignore cases

        System.out.println(st.equalsIgnoreCase("HarRy"));

        //double quote

        System.out.println("My name is \" \n \t Sharif");


    }
}
