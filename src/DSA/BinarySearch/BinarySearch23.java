package DSA.BinarySearch;

public class BinarySearch23 {

    public static void main(String[] args) {
        int []arr = {2,3,5,6,7,8,9,13,45,67,89};
        int target = 5;
        int ans = BinarySearch(arr,target);
        System.out.println("The target value index is " + ans);
    }






    public  static  int BinarySearch(int[]arr,int target){

        int start =0;
        int end= arr.length;

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;

    }

}
