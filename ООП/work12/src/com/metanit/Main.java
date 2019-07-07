package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        vseRaz talk1=new vseRaz();

        talk1.vsyaSt(talk1.stTalk());

    }
}

class Talk{

    Scanner in=new Scanner(System.in);

    float time;
    float cent;

    Talk(){

        time=in.nextFloat();
        cent=in.nextFloat();

    }

    float stTalk(){

        float stoimost=time*cent;

        System.out.println(stoimost);

        return stoimost;

    }

}

class vseRaz extends Talk{

    Scanner in=new Scanner(System.in);

    int count;

    vseRaz(){

       super();

       count=in.nextInt();

    }

    void vsyaSt(float stoimost){

        System.out.println(count*stoimost);

    }

}
