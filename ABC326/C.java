package Atcoder_java.ABC326;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[]arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        sc.close();
        int max=0;
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            int t=arr[i];
            int right=find_binary(arr, t+m);
           
            max=Math.max(max, right-i);
        }
        System.out.println(max);
    }
    public static int find_binary(int[]arr,int k){
        int left=-1,right=arr.length;
        while (Math.abs(right-left)>1) {
            int mid=(right+left)/2;
            if(arr[mid]>=k){
                right=mid;
            }else{
                left=mid;
            }
        }
        return right;
    }
}
