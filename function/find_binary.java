package Atcoder_java.function;

public static int find_binary(int[]arr,int k){
    // k未満の要素数を返す
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