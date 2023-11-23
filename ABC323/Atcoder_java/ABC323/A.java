import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        String ans = "Yes";
        for(int i=0;i<s.length();i++){
            if(i%2+1==2 && s.charAt(i)!='0'){
                ans = "No";
                break;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}