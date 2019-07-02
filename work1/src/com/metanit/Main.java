package com.metanit;

import java.util.Scanner;
import java.lang.String;

public class Main {

    public static void main(String[] args) {

        Scanner in= new Scanner(System.in);

        String chislo1=in.nextLine();
        String chislo2=in.nextLine();
        String chislo3=in.nextLine();

        float c1=Float.parseFloat(chislo1);
        float c2=Float.parseFloat(chislo2);
        float c3=Float.parseFloat(chislo3);

        if ((c1>c2)&&(c1>c3)){
            System.out.println(c1);
        }else if((c2>c1)&&(c2>c3)) {
            System.out.println(c2);
        }else if((c3>c1)&&(c3>c2)){
            System.out.println(c3);
        }

    }
}
