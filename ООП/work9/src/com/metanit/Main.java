package com.metanit;

import java.util.Scanner;
import java.lang.String;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Job job1=new Job();

        job1.output(job1.editDolg(),job1.UvOklad());

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
