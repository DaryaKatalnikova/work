package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        dopDan s1=new dopDan();

        s1.Q2(s1.Q1());

    }
}

class Army{

    Scanner in=new Scanner(System.in);

    String family;
    float rost;
    float ves;

    Army(){

        family=in.nextLine();
        rost=in.nextFloat();
        ves=in.nextFloat();

    }

    float Q1(){

        float Q=rost*ves;

        return Q;
    }

}

class dopDan extends Army{

    Scanner in=new Scanner(System.in);

    String obr;

    dopDan(){

        super();
        obr=in.nextLine();

    }

    void Q2(float Q){

        double QP;

        if(obr.equals("высшее")){

            QP=2*Q;

        }else if(obr.equals("начальное")){

            QP=0.5*Q;

        }else{

            QP=Q;

        }

        System.out.println(QP);

    }

}
