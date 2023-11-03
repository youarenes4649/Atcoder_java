package Atcoder_java.ABC326;

import java.util.*;

public class B{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = N; i < 1000; i++){
            int a = i / 100;
            int b = (i / 10) % 10;
            int c = i % 10;

            if (a * b == c){
                System.out.println((i));
                break;
            }
        }


    }
}