package com.metanit;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        float a=in.nextFloat();
        float b=in.nextFloat();
        float c=in.nextFloat();
        float d=in.nextFloat();

        while(a!=b){
            //System.out.println(a);
            if (a%d==c){
                System.out.println(a);
            }
            a++;
        }
    }
}
