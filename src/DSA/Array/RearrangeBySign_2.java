package DSA.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class RearrangeBySign_2 {
    public static void main(String[] args) {
        int n = 4;
        int arr[]= {9,4,-2,-1,5,0,-5,-3,2};


        int[]ans= RearrangebySign(arr,n);
        System.out.println(Arrays.toString(ans));


    }
    static  int [] RearrangebySign(int [] arr, int n) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                pos.add(arr[i]);
            } else {
                neg.add(arr[i]);
            }

        }
        if (pos.size() > neg.size()) {
            for (int i = 0; i < neg.size(); i++) {
                arr[2 * i] = pos.get(i);
                arr[2 * i + 1] = neg.get(i);

            }
            int index =  neg.size() *2;
            for (int i = neg.size();i<pos.size();i++){
                arr[index] = pos.get(i);
                index++;

            }


        }
        else {
            for (int i = 0; i < pos.size(); i++) {
                arr[2 * i] = pos.get(i);
                arr[2 * i + 1] = neg.get(i);


            }
            int index =  pos.size() *2;
            for (int i = pos.size();i<neg.size();i++){
                arr[index] = neg.get(i);
                index++;


            }

        }
        return  arr;

    }


    // op
}
