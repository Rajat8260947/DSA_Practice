package DSA.Hashmap;

import java.util.HashMap;
import java.util.Map;

public class KSum {
    public static void main(String[] args) {
        int arr[] = {10, 2, -2, -20, 10};
//        int ans = lenOfLongSubarr(arr,5,-10);

//        System.out.println(ans);
      HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        int k = -10;
        int ans = 0;
        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];
            if (map.containsKey(sum - k)) {
                ans = ans + map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);

        }
        System.out.println(ans);
    }
//    public static int lenOfLongSubarr (int A[], int N, int K) {
//        Map<Integer,Integer> map = new HashMap<>();
//
//        int sum =0;
//        int len = 0;
//        for(int i=0;i<N;i++)
//        {
//            sum+=A[i];
//            if(sum == K)
//                len = Math.max(len,i+1);
//            if(map.containsKey(sum-K))
//                len = Math.max(len,i-map.get(sum-K));
//            if(!map.containsKey(sum))
//                map.put(sum,i);
//        }
//        return len;
    }

