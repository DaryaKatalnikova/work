package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        float x=in.nextFloat();
        float y=in.nextFloat();

        int i=1;

        while (x<=y){

            x=x+(x*10/100);
            i++;

        }
        System.out.println(i);

    }
}
