package DSA.Pratice.Array;

//public class GetSingleElement {
//    public static void main(String[] args) {
//        int[] arr = {4, 4,1, 2, 1, 2};
//        int ans = getSingleElement(arr);
//        System.out.println("The single element is: " + ans);
//    }
//    static  int  getSingleElement(int []arr){
//
//
//        for (int i = 0; i < arr.length ; i++) {
//
//            int count =1;
//            for (int j = 0; j < arr.length; j++) {
//                 if(arr[i]==arr[j]){
//                     count++;
//                 }
//
//            }
//            if(count==1){
//                return  arr[i] ;
//            }
//        }
//
//
//         return  -1;
//    }
//}



import java.util.*;

class tUf {
    public static int getSingleElement(int []arr) {
        //size of the array:
        int n = arr.length;

        // Declare the hashmap.
        // And hash the given array:
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int value = mpp.getOrDefault(arr[i], 0);
            mpp.put(arr[i], value + 1);
        }

        //Find the single element and return the answer:
        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            if (it.getValue() == 1) {
                return it.getKey();
            }
        }

        //This line will never execute
        //if the array contains a single element.
        return -1;
    }

    public static void main(String args[]) {
        int[] arr = {4, 1, 2, 1, 2};
        int ans = getSingleElement(arr);
        System.out.println("The single element is: " + ans);

    }
}


