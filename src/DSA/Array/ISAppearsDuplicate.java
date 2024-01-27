package DSA.Array;

public class ISAppearsDuplicate {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4};
       Boolean Ans =  ISAppears(arr,4);
        System.out.println(Ans);
    }
    static  Boolean ISAppears( int[]arr,int n){
        for (int i = 0; i <n ; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i]==arr[j]){
                    return true;
                }
            }

        }
        return false;
    }

}
