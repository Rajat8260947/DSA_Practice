package DSA.Array;

import java.util.Arrays;

public class KthSmallest {

        public static int kthSmallest(int[] arr, int l, int r, int k)
        {
            //Your code here
            Arrays.sort(arr);
            return arr[k-1];
        }
    }


