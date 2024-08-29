package DSA.Pratice.Array;

public class Deleteing {
    public static void main(String[] args) {
        int [] arr = {1,2,0,4,5,0};

//        int[] arr_new = new int[arr.length-1];
//        int index =0;
//        int k=0;
//        for (int i =0; i < arr.length-1; i++) {
//            if (i != index) {
//                arr_new[k] = arr[i];
//                k++;
//
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(arr_new));

        // with out creating array
          int index=3;
        for (int i =0; i < arr.length; i++) {
            if (i == index) {
                for (int j = i; j < arr.length-1; j++) {
                    arr[j]=arr[j+1];

                }
                break;
            }
        }
        System.out.println("Elements after deletion " );
        for(int i = 0; i < arr.length-1; i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }



}
