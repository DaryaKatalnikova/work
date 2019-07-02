package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        String str1=in.nextLine();

        int q=0;
        int i=0;
        int j=str1.length()-1;

        if(str1.length()%2!=0) {

            while ((i < (str1.length() / 2)) && (j > (str1.length() / 2))) {

                if (str1.charAt(i) == str1.charAt(j)) {

                    q++;

                }
                i++;
                j--;
            }
        }else{

            while ((i <= (str1.length() / 2)) && (j >= (str1.length() / 2))) {

                if (str1.charAt(i) == str1.charAt(j)) {

                    q++;

                }
                i++;
                j--;
            }

        }

        if(q==(str1.length()/2)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

    }
}
