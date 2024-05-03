package DSA.Array.PrepInsta;

public class MaximumProductOfSubArray {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, -1, 0};
        int res =arr[0];
//        for (int i = 0; i < arr.length-1 ; i++) {
//            int mul = arr[i];
//            for (int j = i+1; j < arr.length ; j++) {
//                mul=mul*arr[j];
//                res=Math.max(res,mul);
//
//            }
//            res=Math.max(res,mul);
//
//        }
//        System.out.println(res);

        // optimal Solution

         int prefix = 1;
         int suffix =1;
         long maxi = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {

            if(prefix==0){
                prefix=1;
            }
            if(suffix==0){
                suffix=1;
            }

            prefix=prefix*arr[i];
            suffix=suffix*arr[arr.length-i-1];

            maxi=Math.max(maxi,Math.max(prefix,suffix));




        }
        System.out.println("The maximum product of subarray is " + maxi);
    }
}
