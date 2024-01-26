package DSA.BinarySearch;

import java.util.Arrays;

public class FirstIndexAndLastIndex26 {
    public static void main(String[] args) {
        int []arr = {2,3,5,5,5,5,7,8};
        int target = 3;
        int  [] ans  = Search(arr,target);
        System.out.println(Arrays.toString(ans));

    }
        static  int [] Search(int[] arr,int target){
        int  [] ans ={-1,-1};
        int firsIndex = BinarySearch(arr,target,true);
        int lastIndex = BinarySearch(arr,target,false);

        ans[0]=firsIndex;
        ans[1]=lastIndex;

        return ans;
        }
        static int  BinarySearch(int[]arr,int target,boolean findIndex){

           int ans=-1;
            int si=0;
            int  ei = arr.length-1;


            while(si<=ei){
                int mid = (si+ei)/2;// or mid = s+e-s/2;
                if(target==arr[mid]){
                      ans =mid;
                      if(findIndex){
                          ei=mid-1;
                      }
                      else {
                          si=mid+1;
                      }
                }
                else if(target>arr[mid]){
                    si=mid+1;
                }
                else {
                    ei=mid-1;
                }
            }

            return  ans;

        }

}
