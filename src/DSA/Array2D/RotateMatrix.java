package DSA.Array2D;

import java.util.Arrays;

public class RotateMatrix {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotateby90(arr,arr.length);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }

//    static void rotate(int[][] arr) {
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = arr.length-1; j>=0; j--) {
//                System.out.print(arr[j][i] + " ");
//            }
//            System.out.println();
//
//        }
//
//    }



//User function Template for Java


        //Function to rotate matrix anticlockwise by 90 degrees.
        static void rotateby90(int matrix[][], int n)
        {
            // transpos the matrix

            for (int i = 0; i < n-1; i++) {
                for (int j = i + 1; j < n; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] =matrix[j][i];
                    matrix[j][i]= temp;
                }
            }
          


            // Reverse each row
            for (int i = 0; i < n; i++) {
                int start = 0;
                int end = n - 1;

                while(start<=end){
                    int temp = matrix[start][i];
                    matrix[start][i] = matrix[end][i];
                    matrix[end][i] = temp;
                    end--;
                    start++;

                }
            }



        }
    }
