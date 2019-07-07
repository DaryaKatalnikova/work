package com.metanit;

import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Vectors vector1=new Vectors();

        vector1.output(vector1.Seredina(),vector1.Ugolnaklona());

    }
}

class Vectors{

    Scanner in=new Scanner(System.in);

    double x1;
    double y1;
    double x2;
    double y2;

    Vectors(){

        x1=in.nextDouble();
        y1=in.nextDouble();
        x2=in.nextDouble();
        y2=in.nextDouble();

    }

    Vectors(double xz1, double yz1, double xz2, double yz2){

        x1=xz1;
        y1=yz1;
        x2=xz2;
        y2=yz2;

    }

    String Seredina(){

        double xs=(x1+x2)/2;
        double ys=(y1+y2)/2;

        String str1="Середина отрезка находится в точке С("+xs+","+ys+")";

        return str1;
    }

    double Ugolnaklona(){

        double ugol=Math.toDegrees(Math.atan((y2-y1)/(x2-x1)));

        return ugol;

    }

    void output(String str1, double ugol){

        String str="Вектор задан точками A("+x1+","+y1+") B("+x2+","+y2+")";
        System.out.println(str);
        System.out.println("\n"+str1);
        if (ugol!=45){

            System.out.println("Угол не равен 45 градусам ("+ugol+")");

        }else{

            System.out.println("Угол 45 градусов");

        }

    }

}