package com.metanit;

import java.util.Scanner;
import java.lang.String;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        dopDan job1=new dopDan();

        job1.uvelOklad(job1.oklad);

    }
}

class Job{

    Scanner in = new Scanner(System.in);

    String family;
    String dolg;
    float oklad;

    Job(){

        family=in.nextLine();
        dolg=in.nextLine();
        oklad=in.nextFloat();

    }

    float UvOklad(){

        float oklad1=oklad+(oklad*15/100);

        return oklad1;

    }

    String editDolg(){

        String sr="Иван";
        int count=0;
        String newDolg;

        for (int i=0;i<sr.length();i++){

            if(sr.charAt(i)==family.charAt(i)){

                count++;

            }

        }

        if(count==sr.length()){

            newDolg="Инженер";

        }else{

            newDolg="Неизменно";

        }

        return newDolg;

    }

    void output(String newDolg, float oklad1){

        System.out.println("Фамилия: "+family+"\nДОлжность: "+dolg+"\nОклад: "+oklad);
        System.out.println("\nУвеличенный оклад: "+oklad1);
        System.out.println("\nДолжность (новая): "+newDolg);

    }

}

class dopDan extends Job{

    Scanner in=new Scanner(System.in);

    int reit;

    dopDan(){

        super();
        reit=in.nextInt();

    }

    void uvelOklad(float oklad){

        if (reit>=60&&reit<=75){

            System.out.println("Новый оклад: "+(oklad+oklad*20/100));

        }else if(reit>75&&reit<=90){

            System.out.println("Новый оклад: "+(oklad+oklad*40/100));

        }else if(reit>=91&&reit<=100){

            System.out.println("Новый оклад: "+(oklad+oklad*60/100));

        }

    }

}
