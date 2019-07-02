package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        char sim=in.next().charAt(0);

        if((int)sim>=48&&(int)sim<=57){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

    }
}
