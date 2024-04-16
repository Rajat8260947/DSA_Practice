package DSA.Array.PrepInsta;

import java.util.Arrays;
import java.util.HashMap;

public class Countdistinct {
    public static void main(String[] args) {
        int arr[] = {10, 20, 20, 30, 40, 40, 40, 50, 50};
        int n = arr.length;
//        Arrays.sort(arr);
//        int sum=arr[0];
//        int count=1;
//        for (int i = 1; i <n ; i++) {
//            if(arr[i-1]!=arr[i]){
//                count++;
//                sum+=arr[i];
//            }
//
//        }
//        System.out.println(count);
//        System.out.println(sum);


        // or using hashMAp
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
        System.out.println(map.size());
    }
}


