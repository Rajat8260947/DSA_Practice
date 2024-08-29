package DSA.Pratice.String1;

public class Sorting {
    public static void main(String[] args) {
        String str = "zxcbg";
        int n = str.length();

        System.out.println("Before sorting:");
        System.out.println(str);
        System.out.println("After sorting:");
        System.out.println(solve(str, n));
    }
    static   String  solve (String  str ,int n){
        char [] arr = str.toCharArray();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <n-i ; j++) {

                if(arr[j]<arr[j-1]){
                    char temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }

            }

        }

        return  new String(arr);
    }
}
