package DSA.Recursion.Array;

import java.util.ArrayList;

public class ReturnArrayList {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,4,4};
        int target = 4;
        ArrayList<Integer> ans =new ArrayList<>();
        ArrayList<Integer> list = findAllIndex(arr,target,0,ans);
        System.out.println(list);
    }

    static ArrayList<Integer> findAllIndex(int[]arr,int target,int index,ArrayList<Integer> list){
        if(arr.length==index){
            return  list;
        }
        if(arr[index]==target){
            list.add(index);
        }

            return findAllIndex(arr,target,index+1,list);


    }

}
