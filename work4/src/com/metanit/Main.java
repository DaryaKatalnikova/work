package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        int x=in.nextInt();
        int i=1;

        for (;i<=x;i++){
            if (x%i==0){
                System.out.println(i);
            }
        }
    }
}
