package DSA.Array;

import java.util.ArrayList;

public class SUMofIJK {
    public static void main(String[] args) {
        int []arr=  {-1,0,1,2,-1,-4};
        ArrayList<Integer>ans=call(arr);

            System.out.println(ans);


    }
    public static ArrayList<Integer> call(int[]arr){
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if(arr[i]+arr[j]+arr[k]==0){
                         ans.add(arr[i]);
                         ans.add(arr[j]);
                         ans.add(arr[k]);
                    }

                }

            }

        }
        return ans;

    }

}
