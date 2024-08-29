package DSA.Pratice.Array;

public class BinarySearch {
    public static void main(String[] args) {

        int []arr = {2,3,5,67,87,112,115};
        int target = 87;
        int ans = BinarySearch(arr,target);
        System.out.println("The target value index is " + ans);

    }

    static  int  BinarySearch(int[]arr,int target){

        int sp =0;
        int end = arr.length-1;

        while (sp<=end){

            int mid =  (sp+end)/2;

            if(target==arr[mid]){
                return mid;
            }
            else if(target<arr[mid]){
                 end = mid-1;
            }
           else{
               sp=mid+1;
            }
        }
        return  -1;
    }
}
