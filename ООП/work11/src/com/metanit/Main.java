package com.metanit;

import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        dopUgol ABC=new dopUgol();

        ABC.Raznost(ABC.Tngalf());



        //ABC.Tngalf();

    }
}

class Triangle{

    Scanner in=new Scanner(System.in);

    float fk;
    float sk;

    Triangle(){

        fk=in.nextFloat();
        sk=in.nextFloat();

    }

    double Tngalf(){

        double tngalf;

        tngalf=Math.toRadians(sk/fk);

        System.out.println(tngalf);

        return tngalf;
    }

}

class dopUgol extends Triangle{

    Scanner in=new Scanner(System.in);

    double b;

    dopUgol(){

        super();

        b=Math.toRadians(in.nextDouble());

    }

    void Raznost(double tngalf){

        System.out.println(b-tngalf);

    }



}
