package com.metanit;

import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Chisla Chislo1=new Chisla();

        Chislo1.output(Chislo1.KolvoChosel(),Chislo1.SredGeo());

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
