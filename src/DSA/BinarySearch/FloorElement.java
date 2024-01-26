package DSA.Array;

public class FloorElement {
    public static void main(String[] args) {


            int []arr = {2,3,5,67,87,112,115};
            int target = 1;
            int Floor = floor(arr,target);// return an index of the greatest no >= target
            int Ceil = ceiling(arr,target);  // return an index of smalled no >= target
            System.out.println("The Floor Number found in index " + Floor );
            System.out.println("The Ceiling  Number found in index " + Ceil
      );
        }

        public  static  int floor(int[]arr,int target){

            int si=0;
            int  ei = arr.length-1;
            if(target<arr[si] ){
                return -1;
            }
            while(si<=ei){
                int mid = (si+ei)/2;// or mid = s+e-s/2;// int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
                if(target==arr[mid]){
                    return mid;
                }
                else if(target>arr[mid]){
                    si=mid+1;
                }
                else {
                    ei=mid-1;
                }
            }
//
            return  ei; // in ceiling of a number return si;
    }
static int ceiling(int[] arr, int target) {

    // but what if the target is greater than the greatest number in the array
    if (target > arr[arr.length - 1]) {
        return -1;
    }
    int start = 0;
    int end = arr.length - 1;
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
        return start;
    }
}
