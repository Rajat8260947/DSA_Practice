package DSA.Array;

public class MoveZeroToEnd {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int n = 10;
        int[] ans = moveZeros(n, arr);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println("");
    }

     static    int[] moveZeros(int n,int[] arr){
         int j=0;
         for(int i=0;i<n;i++)
         {
             if(arr[i]!=0)
             {
                 int x=arr[i];
                 arr[i]=0;
                 arr[j]=x;
                 j++;
             }

         }
         return  arr;
     }

}
