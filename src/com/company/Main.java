package com.company;
import java. util. Scanner;
public class Main {

    public static void main(String[] args) {
        int temp;
        System.out.println("Enter the value of a and b");
    Scanner sc =new Scanner(System.in);
        int a= sc.nextInt();
        Scanner s1 =new Scanner(System.in);
        int b= s1.nextInt();
        System.out.println("original value of a is "+a);
        System.out.println("original value of b is "+b);
    temp =a;
    a=b;
    b= temp;
        System.out.println("value of a is "+a);
        System.out.println("value of a is "+b);


    }
}
