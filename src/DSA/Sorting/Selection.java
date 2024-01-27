package DSA.Sorting;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int [] arr = {1,2,3,34,23,67,32,5};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static  int max (int[]arr,int start,int end){
        int maxIndex=start;
        for (int i = start; i <= end; i++) {
            if(arr[maxIndex]<arr[i]){
                maxIndex=i;
            }

        }
        return maxIndex;
    }

    static  void swap(int[]arr,int first,int second){
        int temp =arr[first];
        arr[first] =arr[second];
        arr[second] = temp;
    }

    static  void selectionSort(int[]arr){
        for (int i = 0; i < arr.length; i++) {


            int last = arr.length - i - 1;
            int maxIndex = max(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }
}
