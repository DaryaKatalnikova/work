package com.metanit;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        Random random=new Random(System.currentTimeMillis());

        int N=in.nextInt();

        int nums[];
        nums=new int[N];

        for(int i=0;i<N;i++){

            nums[i]=random.nextInt(31)-15;
            System.out.println(nums[i]);

        }

        int q=0;

        for(int i=0;i<N-1;i++) {

            if((nums[i]>0&&nums[i+1]>0)||(nums[i]<0&&nums[i+1]<0)) {

                q = q + 1;
            }

        }
        if (q>0){

            System.out.println("yes");

        }else {

            System.out.println("no");

        }
        }
    }

