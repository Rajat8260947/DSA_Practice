package DSA.Array;

public class MissingElement {

        int[] findTwoElement(int arr[], int n) {
            // code here
            int duplicate = -1;
            int absent = -1;

            for (int num : arr) {
                int index = Math.abs(num) - 1;
                if (arr[index] > 0) {
                    arr[index] = -arr[index];
                } else {
                    duplicate = Math.abs(num);
                }
            }

            for (int i = 0; i < n; i++) {
                if (arr[i] > 0) {
                    absent = i + 1;
                    break;
                }
            }

            return new int[]{duplicate, absent};
        }
    }

