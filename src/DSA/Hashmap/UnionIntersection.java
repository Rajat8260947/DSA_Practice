package DSA.Hashmap;

import java.util.HashSet;

public class UnionIntersection {
    public static void main(String[] args) {
        int[]arr1 = {7,3,9};
        int[]arr2= {6,3,9,6,2,4};
        int res1 = Union(arr1,arr2);
        System.out.println(res1);
        int res2 = Intesection(arr1,arr2);
        System.out.println(res2);
    }
    static  int Union (int[]arr1,int[]arr2){
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
           hs.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
           hs.add(arr2[i]);
        }
        return hs.size();
    }
    static  int Intesection (int[]arr1,int[]arr2){
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr1.length; i++){
            hs.add(arr1[i]);
        }
        int count=0;
        for (int i = 0; i <arr2.length ; i++) {
            if(hs.contains(arr2[i])){
                count++;

                hs.remove(arr2[i]);
            }


        }
     return  count;
    }
}
