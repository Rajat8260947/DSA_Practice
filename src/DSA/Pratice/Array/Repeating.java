package DSA.Pratice.Array;
//
//import java.util.Arrays;
//
//public class Repeating {
//    public static void main(String[] args) {
//        int [] arr = {1,1,2,4,45,2};
//         boolean [] result = new boolean[arr.length];
////        Arrays.fill(result, false);
//
//        for (int i = 0; i < arr.length; i++) {
//            if(result[i] ==true) {
//                continue;
//            }
//            int count=1;
//            for (int j = i+1; j < arr.length; j++) {
//                   if(arr[i]==arr[j]){
//                       count++;
//                       result[j] =true;
//                   }
//            }
//
//            if(count!=1){
//                System.out.print(arr[i] + " ");
//            }
//        }
//    }
//}
import java.util.Arrays;

 public class Repeating
{
    static int findRepeatingElements(int arr[]) {
        Arrays.sort(arr);

        System.out.print("The repeating elements are: ");
        int   j=0;
        for(int i=1;i<arr.length;i++)
            if(arr[j] != arr[i]){
                j++;
                arr[j] = arr[i];
            }

        return j+1;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,4,5,2};
         int result = findRepeatingElements(arr);
        for (int i = 0; i < result; i++) {
            System.out.print(arr[i] + " ");

        }
    }
}