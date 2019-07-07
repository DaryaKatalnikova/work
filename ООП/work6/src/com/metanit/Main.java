package com.metanit;

import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        Complex chislo1=new Complex();

        chislo1.output(chislo1.Grad(),chislo1.Umnoj());

    }
}

class Complex{

    Scanner in=new Scanner(System.in);

    double a;
    double b;

    Complex(){

        a=in.nextDouble();
        b=in.nextDouble();

    }

    Complex(double a1, double b1){

        a=a1;
        b=b1;

    }

    String Umnoj(){

        double q=in.nextDouble();

        double a1=a*q;
        double b1=b*q;

        String ggvp="0";

        if (b1>0){

            ggvp=a1 + "+" + b1 + "i";

        }else if (b1<0){

            ggvp=a1 + "-" + (-1)*b1 + "i";

        }

        return ggvp;

    }

    double Grad(){

        double gradus=0;

        gradus=Math.toDegrees(Math.atan(b/a));

        return gradus;

    }

    void output(double gradus, String ggvp){

        String str1="0";

        if (b>0){

            str1=a + "+" + b + "i";

        }else if(b<0){

            str1=a + b + "i";

        }

        System.out.println(str1);
        System.out.println("\nумножение на число: "+ggvp);
        System.out.println("\nаргумент комплексного числа: "+gradus);

    }
}