package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        Talk talk1=new Talk();

        talk1.cent=in.nextFloat();
        talk1.time=in.nextFloat();

        talk1.stTalk();

    }
}

class Talk{

    float time;
    float cent;

    void stTalk(){

        System.out.println(time*cent);

    }

}
