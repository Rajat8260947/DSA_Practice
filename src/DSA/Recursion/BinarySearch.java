package DSA.Recursion;

public class BinarySearch {
    public static void main(String[] args) {

        int []arr = {2,3,5,6,7,8,9,13,45,67,89};
        int target = 54;
        int ans = BinarySearch(arr,target,0,arr.length-1);
        System.out.println("The target value index is " + ans);
    }

    static  int BinarySearch(int [] arr, int target, int start,int end){
        if(start>end){
            return -1;
        }
        int mid =start + (end-start)/2;

        if(arr[mid]==target){
            return  mid;
        }

        if(target>arr[mid]){
            return  BinarySearch(arr,target,mid+1,end);
        }
        return   BinarySearch(arr,target,start,mid-1);

    }
}
