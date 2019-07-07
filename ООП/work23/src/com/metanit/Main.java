package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        dopDan p1=new dopDan();

        p1.Q2(p1.Q1(),p1.kolvobitv);

    }
}

class Polk{

    Scanner in=new Scanner(System.in);

    String family;
    int kolvobitv;
    int kolvowin;

    Polk(){

       family=in.nextLine();
       kolvobitv=in.nextInt();
       kolvowin=in.nextInt();

    }

    float Q1(){

        float Q=kolvowin*kolvowin/kolvobitv;

        return Q;
    }

}

class dopDan extends Polk{

    Scanner in=new Scanner(System.in);

    int winp;

    dopDan(){

        super();
        winp=in.nextInt();

    }

    void Q2(float Q,int kolvobitv){

        float QP=winp*winp/kolvobitv+Q;

        System.out.println(QP);

    }

}
