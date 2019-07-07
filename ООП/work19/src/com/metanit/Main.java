package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in=new  Scanner(System.in);

        dopDan phone1=new dopDan();

        phone1.Q2(phone1.Q1());

    }
}

class Phone{

    Scanner in=new  Scanner(System.in);

    String marka;
    float cent;
    float pamyat;

    Phone(){

        marka=in.nextLine();
        cent=in.nextFloat();
        pamyat=in.nextFloat();

    }

    float Q1(){

        float Q=pamyat/cent;

        return Q;
    }

}

class dopDan extends Phone{

    Scanner in=new Scanner(System.in);

    int kolvoSIM;

    dopDan(){

        super();
        kolvoSIM=in.nextInt();

    }

    void Q2(float Q){

        float Q12=Q*kolvoSIM;

        System.out.println(Q12);
    }

}
