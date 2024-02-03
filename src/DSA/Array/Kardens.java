package DSA.Array;

public class Kardens {
    public static void main(String[] args) {
        int [] arr ={ -2, 1, -3, 4, -1, 2, 1, -5, 4};

        int Max =MaxElementOfSubarray(arr);
        System.out.println(Max);

    }
    static  int MaxElementOfSubarray(int[]arr) {

//
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            int sum = 0;
//            for (int j = i; j < arr.length; j++) {
//                sum = sum + arr[j];
//
//                if (sum > max) {
//                    max = sum;
//                }
//
//
//            }
//        }
//        return max;

        // or optimal approach;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];

            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }


        }
        return  max;
    }
}
