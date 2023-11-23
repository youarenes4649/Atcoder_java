package Atcoder_java.ABC329;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
        }
        
        Arrays.sort(A);
        for(int i=0,l=N-1;i<l;i++,l--){
            int temp = A[i];
            A[i] = A[l];
            A[l] = temp;
        }
        int max_a = A[0];
        int ans = 0;
        for(int i=0;i<N;i++){
            if (max_a != A[i]){
                ans = A[i];
                break;
            }
        }
        System.out.println(ans);

    }
    
}
