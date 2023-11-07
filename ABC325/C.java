import java.util.*;

public class Main {
    static int h, w;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        h = sc.nextInt();
        w = sc.nextInt();

        int cnt = 0;
        char[][] arr = new char[h][w];
        for (int i = 0; i < h; i++) {
            String line = sc.next();
            arr[i] = line.toCharArray(); //文字が配列に格納できる
        }

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (arr[i][j] == '#') {
                    cnt++;
                    f(i, j, arr);
                }
            }
        }

        System.out.println(cnt);
    }

    static void f(int x, int y, char[][] arr) {
        if (x < 0 || x >= h || y < 0 || y >= w || arr[x][y] != '#') {
            return;
        }

        arr[x][y] = '.'; // Mark the cell as visited

        f(x + 1, y, arr);
        f(x - 1, y, arr);
        f(x, y + 1, arr);
        f(x, y - 1, arr);
        f(x + 1, y + 1, arr);
        f(x - 1, y - 1, arr);
        f(x + 1, y - 1, arr);
        f(x - 1, y + 1, arr);
    }
}
