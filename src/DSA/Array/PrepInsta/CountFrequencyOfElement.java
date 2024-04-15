package DSA.Array.PrepInsta;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CountFrequencyOfElement {
    public static void main(String[] args) {
        int arr[] = new int[]{10, 30, 50, 20, 10, 20, 30, 10};
        int n = arr.length;
        HashMap<Integer, Integer> map =new HashMap<>();
        for (int i = 0; i < n; i++) {
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }
            else{
                map.put(arr[i],map.get(arr[i])+1);
            }

        }

        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey() + " occurs " + entry.getValue()+" times ");

        }

        for (int i = 0; i <n ; i++) {
            if(map.get(arr[i])!=-1){

                System.out.println(arr[i] + " " + map.get(arr[i]));
                map.put(arr[i],-1);
            }

        }
    }
}
