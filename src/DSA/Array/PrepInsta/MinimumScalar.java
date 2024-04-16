package DSA.Array.PrepInsta;

import java.util.Arrays;
import java.util.Collections;

public class MinimumScalar {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 6, 3, 7};
        int arr2[] = {10, 7, 45, 3, 7};
        int n = arr1.length;
        // sort the first array ascending order
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n-i; j++) {
                if (arr1[j-1] > arr1[j]) {
                    int temp = arr1[j-1];
                    arr1[j-1] = arr1[j];
                    arr1[j] = temp;
                }

            }
        }
        // sort the second array descending order
            for (int i = 0; i < n; i++) {
                for (int j = 1; j < n-i; j++) {
                    if (arr2[j-1] <arr2[j]) {
                        int temp = arr2[j-1];
                        arr2[j-1] = arr2[j];
                        arr2[j] = temp;
                    }

                }

            }
            int product = 0;

        for (int i = 0; i < n; i++) {
            System.out.println(arr1[i] + " " + arr2[i]);
            product+=arr1[i]*arr2[i];

        }
        System.out.println(product);
    }
}
