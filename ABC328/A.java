
package Atcoder_java.ABC328;

import java.util.Scanner;

/**
 * A
 */
public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();
        int ans = 0;
        for (int i=0; i<N; i++){
            int S = sc.nextInt();
            if (S <= X) ans += S;
        }
        sc.close();

        System.out.println(ans);
    }
}