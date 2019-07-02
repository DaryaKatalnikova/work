package com.metanit;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        int h2=in.nextInt();
        int m2=in.nextInt();
        int s2=in.nextInt();

        Time time1=new Time();

        Time time2=new Time(h2,m2,s2);

        time1.Ostatok();
        time1.Uvelichenie();
        time1.output(time1.Ostatok(),time1.Uvelichenie());

        time2.Ostatok();
        time2.Uvelichenie();
        time2.output(time2.Ostatok(),time2.Uvelichenie());


    }
}

//6 12 18 24 30

class Time{

    Scanner in=new Scanner(System.in);

    int hours;
    int minuts;
    int seconds;

    Time(){

        hours=in.nextInt();
        minuts=in.nextInt();
        seconds=in.nextInt();

    }

    Time(int h1, int m1, int s1){

        hours=h1;
        minuts=m1;
        seconds=s1;

    }

    float Ostatok(){

        float minutsvse=hours*60+minuts+seconds/60;

        float ost=24*60-minutsvse;

        return ost;

    }

    String Uvelichenie(){

        int hoursuvel=hours+1;
        int minutsuvel=minuts+40;


        if (minutsuvel>60){

            hoursuvel++;
            minutsuvel=minutsuvel-60;

        }else if(minutsuvel==60){
            hoursuvel++;
            minutsuvel=0;
        }

        String ggvp=hoursuvel+":"+minutsuvel;

        return ggvp;
    }

    void output(float ostatok, String ggvp){

        String str1=hours + ":" + minuts + ":" + seconds + "\n" + "Ostatok do 24:00:00 : " + ostatok + "\n" + "vremyz posle uvelicheniya : " + ggvp + ":" + seconds;

        System.out.println(str1);

    }


}
