import java.util.Scanner;

public class Main{
	public static void main(String[] agrs) {
		Scanner scanner = new Scanner(System.in);
		
		int X = scanner.nextInt();
		int Y = scanner.nextInt();
		
		if(Y-X > 2 || Y-X < -3) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
		
	}
}