import java.util.Arrays;

public class Main {
    public static void main(String[] args){
         int N = 6, X = 10;
       int  Arr[] = {1, 4, 45, 6, 10, 8};
        System.out.println(hasArrayTwoCandidates(Arr,N,X));

    }

        static boolean hasArrayTwoCandidates(int arr[], int n, int x) {
            // code here

//            for(int i = 0;i<n;i++){
//
//
//                for(int j = i+1;j<n;j++){
//                    if(arr[i]+arr[j]==x){
//                        System.out.println(arr[i]+arr[j]);
//                        return true;
//                    }
//
//                }
//            }
//            return false;
            Arrays.sort(arr);
            int  j=n-1,i=0;
            System.out.println(Arrays.toString(arr));
               while(i<n){

                if(arr[i]+arr[j]==x){
                    return true;
                }
                else if(arr[i]+arr[j]<x){
                    i++;
                }
                else{
                    j--;
                }

            }
            return false;

        }
    }

