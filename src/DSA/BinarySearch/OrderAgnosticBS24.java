package DSA.BinarySearch;

public class OrderAgnosticBS24 {
    public static void main(String[] args) {

//        int []arr = {2,3,5,67,87,112,115};
        int []arr = {113,34,23,22,11,5,7};
        int target = 5;
        int ans = BinarySearch(arr,target);
        System.out.println("The target value index is " + ans);
    }

    public  static  int BinarySearch(int[]arr,int target){

        int si=0;
        int  ei = arr.length-1;
         Boolean isAsc= arr[si]<arr[ei];


        while(si<=ei){
            int mid = (si+ei)/2;// or mid = s+e-s/2;
            if(target==arr[mid]){
                return mid;
            }

            if(isAsc) {
             if (target > arr[mid]) {
                    si = mid + 1;
                } else {
                    ei = mid - 1;
                }
            }
            else {
                if (target < arr[mid]) {
                    si = mid + 1;
                } else {
                    ei = mid - 1;
                }

            }
        }

        return  -1;

    }
}
