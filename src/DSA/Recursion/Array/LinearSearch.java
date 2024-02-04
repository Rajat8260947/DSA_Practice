package DSA.Recursion.Array;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,4,4};
        int target = 4;
        System.out.println(searchLinear(arr,target,0));
        System.out.println(FindIndex(arr,target,0));
        FindAllIndex(arr,target,0);
        System.out.println(list);

    }
    static  Boolean searchLinear(int [] arr,int target, int index){


        if (index == arr.length){
            return  false;
        }

        return  arr[index]==target || searchLinear(arr,target,index+1);

    }

    static  int FindIndex(int [] arr,int target, int index) {
        if (index == arr.length) {
            return -1;

        }
        if (arr[index] == target) {
            return index;
        } else {

            return FindIndex(arr, target, index + 1);

        }
//
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void FindAllIndex ( int[] arr, int target, int index) {
        if (index == arr.length) {
            return;

        }
        if (arr[index] == target) {
            list.add(index);
        }

            FindAllIndex(arr, target, index + 1);


    }
}
