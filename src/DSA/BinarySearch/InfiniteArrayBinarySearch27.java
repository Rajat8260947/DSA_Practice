package DSA.BinarySearch;

public class InfiniteArrayBinarySearch27 {
    public static void main(String[] args) {
        int  []arr = {1,2,3,4,5,6,7,8,10,1234,45};
        int target = 3;
        int ans = Findingrange(arr,target);
        System.out.println(ans);


    }

    static  int Findingrange(int[]arr,int target){
       int start=0;
       int end=1;

       while(target>arr[end]){
           start=end+1;
           end=start*2+1;
       }
       return  BinarySearch(arr,target,start,end);
    }
    static  int BinarySearch(int[]arr,int target,int start,int end) {
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
