package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        dopDan almaz1=new dopDan();

        almaz1.Q2(almaz1.Q1());

    }
}


class Almaz{

    Scanner in=new Scanner(System.in);

    String name;
    float ves;
    float kachestvo;

    Almaz(){

        name=in.nextLine();
        ves=in.nextFloat();
        kachestvo=in.nextFloat();

    }

    double Q1(){

        double Q=0.4*ves+0.6*kachestvo;

        return Q;

    }

}

class dopDan extends Almaz{

    Scanner in=new Scanner(System.in);

    String color;

    dopDan(){

        super();
        color=in.nextLine();

    }

    void Q2(double Q){

        double QP=0;

        if (color.equals("голубой")){

            QP=Q+1;

        }else if (color.equals("желтый")){

            QP=Q-0.5;

        }else{

            QP=Q;
        }

        System.out.println(QP);

    }

}