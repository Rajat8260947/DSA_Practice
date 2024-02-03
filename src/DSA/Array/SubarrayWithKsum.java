package DSA.Array;

public class SubarrayWithKsum {
    public static void main(String[] args) {
        int [] arr = {1,2,3,5,10,10,23,21,44};
        int K =  20;
        int length =LongestLength(arr,K);
        System.out.println(length);
    }

    static  int LongestLength(int[]arr,int K){

        int len=0;

        for(int i = 0; i< arr.length;i++) {
                int sum =0;
            for (int j = i; j< arr.length; j++) {
                sum =sum+arr[j];

                if(sum == K){
                    len = Math.max(len,j-i+1);
                }



            }
        }
        return  len;
    }


}
