package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        Fiz kinen=new Fiz();

        kinen.m=in.nextFloat();
        kinen.v=in.nextFloat();

        kinen.kinenergy();

        kinen.output(kinen.kinenergy());
    }
}

class Fiz{

    float m;
    float v;

    float kinenergy(){

        float kinetic;

        kinetic=m*v*v/2;

        return kinetic;

    }

    void output(float kinetic){

        String obj="m=" + m + "; " + "v=" + v + ";" + "kinetic=" + kinetic;

        System.out.println(obj);

    }

} //добавить формирование строки с инфой об объекте