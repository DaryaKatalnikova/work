package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        //Time ms=new Time();
       // ms.output(ms.kolvomin());

        pRast rast1=new pRast();
        rast1.Rasstoyanie(rast1.kolvomin());


    }
}

class Time{

    Scanner in=new Scanner(System.in);

    int minuts;
    int seconds;

    Time(){

        minuts=in.nextInt();
        seconds=in.nextInt();

    }

    int kolvomin(){

        int countSeconds=seconds+minuts*60;
        //System.out.println(seconds);

        return countSeconds;
    }

    void output(int countSeconds){

        System.out.println("Количество секунд: "+countSeconds);

    }

}

class pRast extends Time{

    Scanner in=new Scanner(System.in);

    float v;

    pRast(){

        super();

        v=in.nextFloat();

    }

    void Rasstoyanie(int countSeconds){

        float rast=v*countSeconds;

        System.out.println(rast);

    }

}
