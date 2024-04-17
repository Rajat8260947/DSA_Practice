package DSA.Array.PrepInsta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RepeatingElement {
    public static void main(String[] args) {
        int arr[] = new int[]{10, 30, 50, 20, 10, 20, 30, 10};
        int n = arr.length;
        ArrayList<Integer> ans = countFreq(arr, n);
        for(Integer it : ans){
            System.out.println(it);
        }
    }

    static ArrayList<Integer> countFreq(int []arr, int n){
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {

            if(map.containsKey(arr[i])){
                map.put(arr[i],map.getOrDefault(arr[i],1)+1);
            }
            else{
                map.put(arr[i],1);
            }

        }

        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()<=1){
                list.add(entry.getKey());
            }
        }
        return  list;
    }
}
