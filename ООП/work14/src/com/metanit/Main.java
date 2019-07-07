package com.metanit;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

       Fiz2 pot=new Fiz2();

       pot.potEn(pot.m);

        }
}

class Fiz {

    Scanner in = new Scanner(System.in);

    float m;
    float v;

    Fiz() {

        m = in.nextFloat();
        v = in.nextFloat();

    }

    float kinenergy() {

        float kinetic;

        kinetic = m * v * v / 2;

        return kinetic;

    }

    void output(float kinetic) {

        String obj = "m=" + m + "; " + "v=" + v + ";" + "kinetic=" + kinetic;

        System.out.println(obj);

    }
}

class Fiz2 extends Fiz{

    Scanner in=new Scanner(System.in);

    float h;
    double g=9.81;

    Fiz2(){

        super();
        h=in.nextFloat();

    }

    void potEn(float m){

        System.out.println(m*h*g);

    }

}
