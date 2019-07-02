package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        Triangle ABC=new Triangle();

        ABC.fk=in.nextFloat();
        ABC.sk=in.nextFloat();

        ABC.Tngalf();

    }
}

class Triangle{

    float fk;
    float sk;

    void Tngalf(){

        float tngalf;

        tngalf=sk/fk;

        System.out.println(tngalf);
    }

}
