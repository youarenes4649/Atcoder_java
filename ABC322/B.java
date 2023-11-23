import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        String s = scan.next();
        String t = scan.next();
       
        if(t.substring(0, n).equals(s)&&t.substring(m-n, m).equals(s)){
            System.out.println(0);
        }else if(t.substring(0, n).equals(s)&&!t.substring(m-n, m).equals(s)){
            System.out.println(1);
        }else if(!t.substring(0, n).equals(s)&&t.substring(m-n, m).equals(s)){
            System.out.println(2);
        }else {
            System.out.println(3);
        }
        scan.close();
    }
}
