package com.metanit;

import java.util.Scanner;
import java.lang.String;

public class Main {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        String str1=in.nextLine();
        int i=0;
        int count=0;
        int lg=str1.length()-1;

        System.out.println(lg);

        if (str1.charAt(0)!=' '){
            count++;
        }

        while(i<lg) {

            if((str1.charAt(i)==' ')&&(str1.charAt(i+1)!=' ')){

                count++;

            }

            i++;

        }

        System.out.println(str1);
        System.out.println(count);
    }
}
