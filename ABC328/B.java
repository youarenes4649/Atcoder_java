package Atcoder_java.ABC328;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int ans = 0;

        for (int i=1; i<=N; i++){
            int D = sc.nextInt();
            for (int j=1; j<=D; j++){
                if (i/10 < 1){
                if (j/10 < 1){
                    if (i==j){
                        ans += 1;

                    }
                }
                else{
                    if (i == j%10 && i == j/10){

                        ans += 1;

                    }
                }
            }
            else{
                if (i/10 == i%10){
                if (j/10 < 1){
                    if (i%10 == j) ans += 1; 
                }
                else{
                    if(i%10 == j/10 &&i%10 == j%10 ) ans += 1;
                }
        }

        }


    }
    
}System.out.println(ans);
    }
}
