package DSA.String;

import java.util.Arrays;

public class SortString {
    public static void main(String[] args) {
        String str =  "zxcbg";
         str = str.toLowerCase();

        char []ch = str.toCharArray();
        Arrays.sort(ch);
        System.out.println(String.valueOf(ch));
    }
}
