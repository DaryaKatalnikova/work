package com.metanit;

import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        newChisla Chislo1=new newChisla();

        Chislo1.skSumm(Chislo1.x,Chislo1.y,Chislo1.z);

    }
}

class Chisla{

    Scanner in = new Scanner(System.in);

    float x;
    float y;
    float z;

    Chisla(){

        x=in.nextFloat();
        y=in.nextFloat();
        z=in.nextFloat();

    }

    Chisla(float x1, float y1, float z1){

        x=x1;
        y=y1;
        z=z1;

    }

    double SredGeo(){

        double srg=Math.cbrt(x*y*z);

        return srg;
    }

    int KolvoChosel() {

        float summ = x + y + z;
        int count = 0;
        String s1=summ+"";

        if (summ%1==0) {

            count = s1.length() - 2;

        }else{

            count = s1.length() - 1;

        }

        return count;

    }

    void output(int count, double srg){

        String str1="Числа: "+x+","+y+","+z;
        System.out.println(str1);
        System.out.println("\nСреднее геометрическое: "+srg);
        System.out.println("\nСумма чисел: "+(x+y+z)+" Количество чисел в сумме: "+count);

    }
}

class newChisla extends Chisla{

    Scanner in=new Scanner(System.in);

    float a;
    float b;
    float c;

    newChisla(){

        super();
        a=in.nextFloat();
        b=in.nextFloat();
        c=in.nextFloat();

    }

    void skSumm(float x,float y,float z){

        System.out.println("Скалярная сумма: "+(x*a+y*b+z*c));

    }
}
