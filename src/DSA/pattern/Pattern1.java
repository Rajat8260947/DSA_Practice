package DSA.pattern;

public class Pattern1 {
    public static void main(String[] args) {

//        pattern1(4);
//        pattern2(5);
//        pattern3(5);
//        pattern4(5);
//        pattern5(5);
//        pattern6(5);
        pattern7(5);

    }

    static void pattern1(int n) {
        for (int row = 1; row <=n ; row++) {

            for (int col = 1; col <=row ; col++) {
                System.out.print("* ");

            }
            System.out.println();

        }

    }
    static void pattern2(int n) {
        for (int row = 1; row <=n ; row++) {

            for (int col = 1; col <=n ; col++) {
                System.out.print("* ");

            }
            System.out.println();

        }

    }
    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= n-row+1; col++) {
                System.out.print("* ");

            }
            System.out.println();

        }

    }
    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <=row; col++) {
                System.out.print(col  + " ");

            }
            System.out.println();

        }
    }
    static void pattern5(int n) {
        int total_row =2*n-1;
        for (int row = 1; row <= total_row; row++) {
             int total_colsInrow = row>n?total_row-row+1:row;
                  int noOfSpaces= n-total_colsInrow;
            for (int s = 1; s <= noOfSpaces; s++) {
                System.out.print(" ");
            }
                 for ( int col = 1; col <=total_colsInrow; col++) {
                     System.out.print( "* ");

                 }

            System.out.println();

        }


    }
    static void pattern6(int n) {
        for (int row = 1; row <= n; row++) {

            for (int space =0; space<n-row ;space++){
                System.out.print(" ");
            }
            for (int col = row; col >=1; col--) {
                System.out.print(col + " ");

            }
            for (int col = 2; col <=row; col++) {
                System.out.print(col + " ");

            }
            System.out.println();

        }
    }

    static void pattern7(int n) {
        for (int row = 1; row <= 2*n; row++) {
               int total_row = row>n ?2 * n-row : row;
            for (int space =0; space<n-total_row;space++){
                System.out.print(" ");
            }
            for (int col =  total_row; col >=1; col--) {
                System.out.print(col + " ");

            }
            for (int col = 2; col <= total_row; col++) {
                System.out.print(col + " ");

            }
            System.out.println();

        }
    }
    }
