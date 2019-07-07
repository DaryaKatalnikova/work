package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        Komp komp1=new Komp();

        komp1.inf(komp1.Stoimost(),komp1.Prig());

        Nout nout1=new Nout();

        nout1.inf(nout1.Stoimost(nout1.Stoimost()),nout1.Prig(nout1.Prig()));

    }
}

class Komp{

    Scanner in=new Scanner(System.in);

    int chastota;
    int kolvoyader;
    int pamyat;
    int hdisk;

    Komp(){

        chastota=in.nextInt();
        kolvoyader=in.nextInt();
        pamyat=in.nextInt();
        hdisk=in.nextInt();

    }

    float Stoimost(){

        float QP=chastota*kolvoyader/100+pamyat/80+hdisk/20;

        return QP;
    }

    boolean Prig(){

        boolean QB;

        if(chastota>=2000&&kolvoyader>=2&&pamyat>=2048&&hdisk>=320){

            QB=true;

        }else {

            QB=false;
        }

        return QB;

    }

    void inf(float QP, boolean QB){

        System.out.println("частота: "+chastota+"\nколичество ядер: "+kolvoyader+"\nобъем памяти: "+pamyat+"\nобъем жесткого диска: "+hdisk);
        System.out.println("\nСтоимость: "+QP);
        System.out.println("\nПригодность: "+QB);

    }
}

class Nout extends Komp{

    Scanner in=new Scanner(System.in);

    int prodwork;

    Nout(){

        super();
        prodwork=in.nextInt();

    }

    float Stoimost(float QP){

        float QP1=QP+prodwork/10;

        return QP1;

    }

    boolean Prig(boolean QB){

        boolean QB1;

        if (QB&&prodwork>=60){

            QB1=true;
        }else{

            QB1=false;

        }

        return QB;
    }

}


