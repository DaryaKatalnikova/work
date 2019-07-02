package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        int N=in.nextInt();

        int nums[];
        nums=new int[N];

        for(int i=0;i<N;i++){

            nums[i]=in.nextInt();

        }

        for(int i=0;i<N;i++){
            System.out.print(nums[i]);
        }

        System.out.print("\n");

        int max=nums[0];

        for(int i=1;i<N;i++){

            if (max<nums[i]){
                max=nums[i];
            }

        }

        System.out.print(max);

    }
}
