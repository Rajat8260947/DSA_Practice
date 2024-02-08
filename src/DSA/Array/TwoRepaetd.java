package DSA.Array;

import java.util.Arrays;

public class TwoRepaetd {
    public static void main(String[] args) {

        int []arr= {1,2,1,3,4,3};
        int []ans = twoRepeated(arr, arr.length);
        System.out.println(Arrays.toString(ans));

    }
    public  static  int[] twoRepeated(int arr[], int N){
    int[] ans = new int[2];
        Arrays.sort(arr);
      int j =0;
        for(int i =1;i<N;i++){
        if(arr[i]==arr[i-1]){
            ans[j]=arr[i];
            j++;
        }
    }
        return ans;
}
}
