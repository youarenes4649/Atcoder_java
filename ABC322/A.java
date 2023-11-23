
package Atcoder_java.ABC322;

import java.util.Scanner;

/**
 * A
 */
public class A {
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        Boolean frag = false;
        for (int i=0;i<N-2;i++){
            if (S.charAt(i) == 'A' && S.charAt(i+1) == 'B' && S.charAt(i+2) == 'C'){
                System.out.println(i+1);
                frag = true;
                break;
            }
        }
        if (!frag) System.out.println(-1);

    }
}