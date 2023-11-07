import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	String s = sc.next();
    	
    	char[] c = s.toCharArray();
    	
    	
    	String ans = "No";
    	for(int i = 0; i < n-1; i++) {
    		if(c[i] == 'a' && c[i+1] == 'b') {
    			ans = "Yes";
    			break;
    		}else if(c[i] == 'b' && c[i+1] =='a') {
    			ans = "Yes";
    			break;
    		}
    	}
    	System.out.println(ans);
    }
}

import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    boolean ans = false;
    
    if(S.indexOf("ab") != -1) ans = true; // indexOf でそれがあった場合は-1にならない
    if(S.indexOf("ba") != -1) ans = true;
    
    if(ans) System.out.println("Yes");
    if(!ans) System.out.println("No");
  }
}