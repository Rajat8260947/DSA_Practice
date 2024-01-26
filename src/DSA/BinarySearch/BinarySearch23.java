package DSA.Array;

public class BinarySearch23 {

    public static void main(String[] args) {
        int []arr = {2,3,5,6,7,8,9,13,45,67,89};
        int target = 5;
        int ans = findingRange(arr,target);
        System.out.println("The target value index is " + ans);
    }

    static   int findingRange(int[]arr,int target){

        int start=0;
        int end =1;
        while (target>arr[end]){
            int temp = end + 1; // this is my new start
            // double the box value
            // end = previous end + sizeofbox*2
            end = end + (end - start + 1) * 2; // start=end+1;end=start*2+1;
            start = temp;
        }
        return BinarySearch(arr,target,start,end);
    }





    public  static  int BinarySearch(int[]arr,int target,int start,int end){

//        int si=start;
//        int  ei = end;


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
