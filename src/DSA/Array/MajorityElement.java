package DSA.Array;

public class MajorityElement {
    public static void main(String[] args) {
        int [] arr = {1,2};
        int size = arr.length;
        int ans = majority( arr ,size);
        System.out.println(ans);
    }
     static  int majority (int []a,int size){
         int n = size;
         int count = 0;
         int element =0;

         for(int i =0;i<n;i++){
             if(count==0){
                 count = 1;
                 element = a[i];
             }
             if(a[i]==element){
                 count++;
             }
             else{
                 count--;
             }

         }
          count =0;
         for(int i =0;i<n;i++){
             if(a[i]==element){
                 count++;
             }

         }
         if(count>(n/2)){
             return element;

         }

         return -1;
     }

}
