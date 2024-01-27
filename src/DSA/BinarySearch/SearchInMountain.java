package DSA.BinarySearch;

public class SearchInMountain {
    public static void main(String[] args) {
        int []arr = {2,3,5,6,12,34,10,9,6,4};
        int target = 34;
        int ans = Search(arr,target);
        System.out.println("The target value index is " + ans);
    }
    static  int Search(int[]arr,int target){
        int peak = PeakIndexInMountainArray(arr,target);
        if(arr[peak]==target){
            return peak;
        }
        int FirstAscending = OrderAgnosticBinarySearch(arr,target,0,peak);
         if(FirstAscending!=-1){
             return FirstAscending;
         }
        return OrderAgnosticBinarySearch(arr,target,peak+1, arr.length-1);
    }

     static  int PeakIndexInMountainArray(int [] arr,int target){
        int start=0;
        int end =arr.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            else {
                start=mid+1;
            }
        }
        return start;
     }

     static  int OrderAgnosticBinarySearch(int[]arr,int target,int start,int end){
       Boolean isAsc= arr[start]<arr[end];
       while (start<=end){
           int mid = start+(end-start)/2;
           if(arr[mid]==target){
               return mid;
           }
           else {
               if(isAsc){
                   if(arr[mid]>target){
                       end=mid-1;
                   }
                   else {
                       start=mid+1;
                   }
               }
               else{
                   if(arr[mid]<target){
                       end=mid-1;
                   }
                   else {
                       start=mid+1;
                   }
               }
           }
       }
         return -1;
     }
}
