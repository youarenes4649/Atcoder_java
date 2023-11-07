package Atcoder_java.ABC327;
import java.util.*;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[9][9];
        for (int i = 0 ; i < 9 ; i++){
            for (int j = 0 ; j < 9 ; j++){
                int a = sc.nextInt();
                arr[i][j] = a;
            }
        }

        // 行判定
        for (int i = 0 ; i < 9 ; i ++){
            List<Integer> gyou_check = new ArrayList<Integer>();
            for (int j = 0 ; j < 9 ; j++){
                // 配列の中にある場合
                if(Arrays.asList(gyou_check).contains(arr[i][j])){
                    System.out.println("No");
                    break;
                
                }else gyou_check.add(arr[i][j]);
            }
        }
        // 列判定
        for (int i = 0 ; i < 9 ; i ++){
            List<Integer> retu_check = new ArrayList<Integer>();
            for (int j = 0 ; j < 9 ; j++){
                // 配列の中にある場合
                if(Arrays.asList(retu_check).contains(arr[j][i])){
                    System.out.println("No");
                    break;
                
                }else retu_check.add(arr[j][i]);
            }
        }
        // ３x３判定
        for (int i = 0 ; i < 9; i ++){
            List<Integer> sankakesan_check = new ArrayList<Integer>();
            for (int j = 0 ; j < 3 ; j++){
                for (int k = 0 ; k < 3 ;k++){
                    System.out.println(Arrays.stream(sankakesan_check).anyMatch(arr[(i / 3) * 3+j][(i%3) * 3+k]::equals));
                    if(Arrays.asList(sankakesan_check).contains(arr[(i / 3) * 3+j][(i%3) * 3+k])){
                        System.out.println("No");
                        break;
                }else sankakesan_check.add(arr[(i / 3) * 3+j][(i%3) * 3+k]);
                // 配列の中にある場合

                
            }
        }

        
  }
  System.out.println("Yes");
    }
}