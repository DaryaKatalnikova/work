package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in= new Scanner(System.in);

	    int year=in.nextInt();
        if(((year%4==0)&&(year%100!=0))||(year%400==0)){
            System.out.println("Год високосный");
        }
        else{
            System.out.println("Год невисокосный");
        }

    }
}
