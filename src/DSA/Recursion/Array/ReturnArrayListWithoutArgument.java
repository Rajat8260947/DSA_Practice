package DSA.Recursion.Array;

import java.util.ArrayList;

public class ReturnArrayListWithoutArgument {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,4,4};
        int target = 4;
        ArrayList<Integer> list = findAllIndex(arr,target,0);
        System.out.println(list);

    }
    static ArrayList<Integer> findAllIndex(int[]arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(arr.length==index){
            return  list;
        }
        // this will contain answer for the function call only
        if(arr[index]==target){
            list.add(index);
        }

        ArrayList<Integer> ansFromBelow = findAllIndex(arr,target,index+1);
        list.addAll(ansFromBelow);

        return list;


    }
}
