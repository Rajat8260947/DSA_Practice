package DSA.Array;

public class PascalTriangle {
    public static void main(String[] args) {
        int row =6;
        int col = 4;
        int ans = result(row-1,col-1);// n^r-1,c-1
        System.out.println(ans);

    }

    // for specif row and column value
    static  int result(int n, int r){
          int ans =1;
        for (int i = 0; i < r; i++) {
             ans = ans*(n-i);
             ans = ans/(i+1);

        }
        return  ans;
    }

    // for specific row print
    static  int specificRow(int n , int r){// here  n is row r is column

        int ans =1;
        for (int i = 0; i <r ; i++) {
             ans = ans* (n-i);
             ans = ans/i+1;

        }
        return  ans;
    }
}
