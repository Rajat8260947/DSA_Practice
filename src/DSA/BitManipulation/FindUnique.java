package DSA.BitManipulation;

public class FindUnique {
    public static void main(String[] args) {
        int []arr= {2, 3, 4, 5, 2, 3, 4, 5, 6};
        System.out.println(unique(arr));
    }
    static  int unique (int[]arr){
        int unique =0;
        for(int a : arr){
            unique^=a;
        }
        return  unique;
    }
}
