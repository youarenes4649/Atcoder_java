import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long B = Long.parseLong(scanner.next());//文字列を数値に変換してくれる
        BigDecimal b = new BigDecimal(B);
        scanner.close();
        for (int i=1;i<16;i++) {
            BigDecimal x = new BigDecimal(i);
            if (x.pow(i).equals(b)) {
                System.out.println(i);
                return;
            }
        }
        System.out.println("-1");
    }
}

