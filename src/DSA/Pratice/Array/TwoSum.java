package DSA.Pratice.Array;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,6,5,8,11};
        int n = arr.length;
        int target =11;

        boolean  res= sort( arr, target,n);
        System.out.println(res);
    }

    static  boolean sort(int[]arr,int target ,int n){

//        for (int i = 0; i <n ; i++) {
//            for (int j = i+1; j < n; j++) {
//                if(arr[i]+arr[j] ==target){
//                     return  true;
//                }
//            }
//
//        }
//       return  false;
        Arrays.sort(arr);
        int j= n-1;
        int i=0;
         while(i<j){
             if(arr[i]+arr[j]==target){
                 return  true;
             } else if (arr[i]+arr[j]<target) {
                   i++;
             }
             else {
                 j--;
             }
         }

         return  false;
    }


}
