package DSA.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class RearrangeBySign {
    public static void main(String[] args) {
        int n = 4;
        int arr[]= {1,2,-4,-5};


        int[]ans= RearrangebySign(arr,n);
        int[]opt= optimal(arr);

        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(opt));
    }
    static  int [] RearrangebySign(int [] arr, int n){
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg= new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if(arr[i]>0){
                pos.add(arr[i]);
        }
            else {
                neg.add(arr[i]);
            }

        }
        for (int i = 0; i < n/2; i++) {
            arr[2*i]= pos.get(i);
            arr[2*i+1]= neg.get(i);

        }

        return  arr;
    }

    // optimal approach


    static int [] optimal (int[]arr){
        int [] ans = new int[arr.length];

        int posIndex = 0 ;
        int negIndex = 1;

        for (int i = 0; i < arr.length; i++) {

            if(arr[i]>0){
                ans[posIndex] = arr[i];
                posIndex =posIndex+2;
            }
             else {
            ans[negIndex] = arr[i];
              negIndex =negIndex+2;
            }

        }
        return  ans;

    }

}
