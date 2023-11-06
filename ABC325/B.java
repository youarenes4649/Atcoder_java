package Atcoder_java.ABC325;

import java.util.Scanner;

public class B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Integer W[] = new Integer[N];       
        Integer X[] = new Integer[N];
        for (int i = 0; i < N; i++){
            W[i] = sc.nextInt();
            X[i] = sc.nextInt();
        }
        sc.close();

        int ans = 0;
        for (int i = 0; i < N; i++){
            int tmp_ans = 0;
            for (int j = 0; j < N; j++){
                int a = X[j];
                int b = X[i];
                if (a - b < 0){
                    b = 24 - b;
                    if (a + b <= 8) tmp_ans += W[j];
                } 
                else{
                    if (a - b <= 8) tmp_ans += W[j];
                }
                
                
            } 

            if (ans < tmp_ans) ans = tmp_ans;

        }
        System.out.println(ans);

    }
    
}
