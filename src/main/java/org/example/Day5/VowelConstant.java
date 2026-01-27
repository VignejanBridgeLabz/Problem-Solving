package org.example.Day5;

import java.util.Scanner;

public class VowelConstant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Alphabet: ");
        char a=sc.next().charAt(0);
        if((a=='a')||(a=='e')||(a=='i')||(a=='o')||(a=='u')||(a=='A')||(a=='E')||(a=='I')||(a=='O')||(a=='U')){
            System.out.println("The alphabet is Vowel");
        }
        else{
            System.out.println("The alphabet is Constant");
        }
    }
}
