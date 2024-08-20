package DSA.Pratice;

public class FrequenctCount {
    public static void main(String[] args) {
        int arr[] ={10,5,10,15,10,5};
        int n = arr.length;
        countFreq(arr, n);
    }

    static  void countFreq(int[] arr,int n) {

         int maxfreq=0;
         int minfreq=n;

         int maxEle=0;
         int minEle =0;

        boolean visited[] = new boolean[n];

        for (int i = 0; i <n ; i++) {
            if(visited[i]==true){
                continue;
            }
           int   count =1;
            for (int j = i+1; j <n ; j++) {
                 if(arr[i]==arr[j]){
                     count++;
                     visited[j]=true;
                 }

            }
//            minfreq = Math.min(minfreq,count);
//            maxfreq = Math.max(maxfreq,count);


//            System.out.println(arr[i] + " " + count);

            if(count>maxfreq){
                maxEle=arr[i];
                maxfreq=count;

            }
            if(count<minfreq){
                minEle=arr[i];
                minfreq=count;

            }

        }
        System.out.println("The highest frequency element is: " + maxEle);
        System.out.println("The lowest frequency element is: " + minEle);
    }
}
//import java.util.*;

//public class Main {
//
//    public static void main(String args[]) {
//
//        int arr[] = {10, 5, 10, 15, 10, 5};
//        int n = arr.length;
//        Frequency(arr, n);
//    }
//    static void Frequency(int arr[], int n) {
//        Map<Integer, Integer> map = new HashMap<>();
//
//        for (int i = 0; i < n; i++) {
//            if (map.containsKey(arr[i])) {
//                map.put(arr[i], map.get(arr[i]) + 1);
//            } else {
//                map.put(arr[i], 1);
//            }
//        }
//
//        int maxFreq = 0, minFreq = n;
//        int maxEle = 0, minEle = 0;
//        // Traverse through map and find the elements
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            int count = entry.getValue();
//            int element = entry.getKey();
//
//            if (count > maxFreq) {
//                maxEle = element;
//                maxFreq = count;
//            }
//            if (count < minFreq) {
//                minEle = element;
//                minFreq = count;
//            }
//        }
//
//        System.out.println("The highest frequency element is: " + maxEle);
//        System.out.println("The lowest frequency element is: " + minEle);
//    }
//}
