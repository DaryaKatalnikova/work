package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        int N=in.nextInt();
        int i=0;

        for(;i<N;i++) {

            if(i*i<N) {

                System.out.println(i);

            }
        }

    }
}
