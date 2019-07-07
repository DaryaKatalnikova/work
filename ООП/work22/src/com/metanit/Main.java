package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        dopDan a1=new dopDan();

        a1.Q2(a1.Q1());

    }
}

class Ant{

    Scanner in=new Scanner(System.in);

    String name;
    float mosh;
    float h;

    Ant(){

        name=in.nextLine();
        mosh=in.nextFloat();
        h=in.nextFloat();

    }

    double Q1(){

        double Q=mosh+0.5*h;

        return Q;

    }
}

class dopDan extends Ant{

    Scanner in=new Scanner(System.in);

    float kizl;

    dopDan(){

        super();
        kizl=in.nextFloat();

    }

    void Q2(double Q){

        double QP=Q-0.1*kizl;

        System.out.println(QP);

    }

}
