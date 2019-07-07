package com.metanit;

import java.util.Scanner;
import  java.util.Random;

public class Main {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        String student[]=new String[10];

        int k=0;

        for (;k<10; k++){

            if (k<5){

                normStudent studentN=new normStudent();
                studentN.inf(studentN.Zachet());

            }else if(k>4&&k<10){

                soobStudent studentK=new soobStudent();
                studentK.inf(studentK.Zachet());

            }else{

                Genyi studentQ=new Genyi();
                studentQ.inf(studentQ.Zachet());

            }

        }

    }
}

class Student{

    Scanner in=new Scanner(System.in);

    String FIO;
    int kolvopz;
    int kolvoz=20;

    Student(){

        FIO=in.nextLine();
        kolvopz=in.nextInt();

    }

    void inf(boolean Zachet){

        System.out.println("ФИО: "+FIO+"\nколичесетво посещенных занятий: "+kolvopz);
        System.out.println("\nЗачет: "+Zachet);

    }

}

class normStudent extends Student{

    Scanner in=new Scanner(System.in);
    Random r=new Random();

    boolean Zachet(){

        boolean ZZ=true;

        if (kolvopz==kolvoz){

            ZZ=true;

        }else if(kolvopz>=kolvoz/2){

            if(r.nextFloat()<0.5){

                ZZ=false;

            }else{

                ZZ=true;

            }

        }else{

            ZZ=false;

        }

        return ZZ;
    }
}

class soobStudent extends Student{

    Scanner in=new Scanner(System.in);
    Random r=new Random();

    boolean Zachet(){

        boolean ZZ=true;

        if (kolvopz==kolvoz){

            ZZ=true;

        }else if(kolvopz>=kolvoz/2){

            if(r.nextInt()<0.7){

                ZZ=false;

            }else {

                ZZ = true;

            }

        }else{

            ZZ=false;

        }

        return ZZ;
    }

}

class Genyi extends Student{

    Scanner in=new Scanner(System.in);

    boolean Zachet(){

        boolean ZZ=true;

        if (kolvopz>=1){

            ZZ=true;

        }else{

            ZZ=false;

        }

        return ZZ;
    }

}
