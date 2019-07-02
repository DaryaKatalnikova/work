package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        Work work1=new Work();

        work1.hour=in.nextFloat();
        work1.oplata=in.nextFloat();

        work1.stWork();

    }
}

class Work{

    float oplata;
    float hour;

    void stWork(){

        System.out.println(oplata*hour);

    }

}
