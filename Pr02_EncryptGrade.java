package com.company;

public class Pr02_EncryptGrade {
    public static void main(String[] args) {
       char grade = 'B';
       grade =(char)(grade + 8) ;
        System.out.println(grade);
       // Decrypt Grage
        grade = (char)(grade - 8);
        System.out.println(grade);
    }
}
