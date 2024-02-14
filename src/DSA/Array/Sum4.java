package DSA.Array;

import java.util.*;

public class Sum4 {
    public static void main(String[] args) {
        int []arr = {1,0,-1,0,-2,2};
        int n = arr.length;
//        List<List<Integer> >ans = fourt(arr, n);
        List<List<Integer> >ans = optimal(arr, n);

        for(List<Integer> it : ans){
            System.out.print("[");
            for(Integer i: it){
                System.out.print(i +" ");
            }
            System.out.print("]");
        }
        System.out.println();
    }
   static   List<List<Integer>> fourt(int[]arr,int n){
       Set<List<Integer>> st = new HashSet<>();
       for (int i = 0; i < n; i++) {
           for (int j = i+1; j <n ; j++) {
               for (int k = j+1; k < n; k++) {
                   for (int l = k+1; l <n ; l++) {
                        long sum = arr[i]  + arr[j];
                        sum +=arr[k];
                        sum +=arr[l];
                        if(sum==0){
                            List<Integer> temp = Arrays.asList(arr[i],arr[j],arr[k],arr[l]);
                            temp.sort(null);
                            st.add(temp);
                        }

                   }



               }

           }

       }

       List<List<Integer>>ans = new ArrayList<>(st);
       return  ans;
   }
   // optimal approach

    static  List<List<Integer>> optimal(int []arr, int n){
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            if(i!=0 && arr[i]==arr[i-1]) continue;
            for (int j = i+1; j < n; j++) {
                if(j>i+1 && arr[j]==arr[j-1])continue;
                int k = j+1;
                int l =n-1;
                while(k<l){
                    long sum = arr[i]+arr[j] +arr[k] +arr[l];
                    if(sum<0){
                        k++;
                    } else if (sum>0) {
                        l--;

                    }
                    else{
                        List<Integer>temp = Arrays.asList(arr[i],arr[j],arr[k],arr[l]);
                        ans.add(temp);
                         k++;
                         l--;
                         while(k<l && arr[k]==arr[k-1])k++;
                         while(k<l && arr[l]==arr[l+1])l--;

                    }
                }
            }


        }
        return  ans;
    }

}
