package DSA.Hashmap;

import java.util.HashSet;

public class DistinctElement {
    public static void main(String[] args) {
        int  []arr = {1,22,44,4,5,2,1,3,45,6,2,5,3};

        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {

            hs.add(arr[i]);

        }
        System.out.println(hs.size());
    }

}
