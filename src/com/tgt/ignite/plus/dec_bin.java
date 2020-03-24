package com.tgt.ignite.plus;

import java.util.Scanner;

public class dec_bin {
    public static void main(String[] args){
        int n,i=0;
        int[] binnum = new int[1000];
        Scanner read= new Scanner(System.in);
        System.out.println("enter a decimal num");
        n=read.nextInt();
        while(n>0){
            binnum[i] = n%2;
            n=n/2;
            i++;
        }
        for(int j=i-1;j>=0;j--){
            System.out.print(binnum[j]);
        }
    }
}
