package DSA.Array.PrepInsta;

public class SortingTheArray {
    public static void main(String[] args) {
        int [] arr = new int [] {10, 40, 1,4,3,2,1,30, 20};
        int temp = 0;
        for (int i = 0; i < arr.length-1 ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i]>arr[j]){
                    temp =arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
