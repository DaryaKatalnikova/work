package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        Nalogi work1=new Nalogi();

        work1.naRuki(work1.stWork());

    }
}

class Work{

    Scanner in=new Scanner(System.in);

    float oplata;
    float hour;

    Work(){

        oplata=in.nextFloat();
        hour=in.nextFloat();

    }

    float stWork(){

        float stw=oplata*hour;

        System.out.println(stw);

        return stw;

    }

}

class Nalogi extends Work{

    Scanner in=new Scanner(System.in);

    float podNalog;

    Nalogi(){

        super();
        podNalog=in.nextFloat();

    }

    void naRuki(float stw){

        float zp=stw-(stw*podNalog/100);

        System.out.println(zp);

    }

}
