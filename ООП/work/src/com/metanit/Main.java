package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        Time ms=new Time();
        ms.minuts=in.nextInt();
        ms.seconds=in.nextInt();
        ms.kolvomin();

    }
}

class Time{

    int minuts;
    int seconds;

    void kolvomin(){

        seconds=seconds+minuts*60;
        System.out.println(seconds);
    }

}
