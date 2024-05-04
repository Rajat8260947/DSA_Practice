package DSA.Array.PrepInsta;

import java.util.HashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int arr[] = {10, 20, 20, 30, 40, 40, 40, 50, 50};
//        int n = arr.length;
//        HashSet<Integer> set = new HashSet<>();
//        for (int i = 0; i < n; i++) {
//            set.add(arr[i]);
//
//        }
//        System.out.println(set);

        // in array
        int i =0;
        for (int j = 1; j < arr.length; j++) {
                if(arr[i]!=arr[j]){
                    i++;
                    arr[i]=arr[j];
                }

        }
        for (int k= 0; k <i+1 ; k++) {
            System.out.println(arr[k]);

        }

    }
}
