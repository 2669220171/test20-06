package com.bjpoweernode.domain;
import java.util.Arrays;
import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        System.out.println("Hello Word");
        System.out.println("Hello new word");
    }
}

 class Main {
    public static int fac (int a,int b){
     if((a == 0 && b != 0) || (a != 0 && b == 0)){
         return 1;
        }else if (a == 0 && b ==0){
         return 0;
        }
     return fac(a-1,b) + fac(a,b-1);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(fac(n,m));
    }

}


