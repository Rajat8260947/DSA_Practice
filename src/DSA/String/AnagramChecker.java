package DSA.String;

import java.sql.ResultSet;
import java.util.Arrays;

public class AnagramChecker {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        boolean result = Check(str1, str2);
        if(result==true){
            System.out.println("Two String are Anagram");
        }
        else {
            System.out.println("Not Anagram");
        }

    }


    static boolean Check(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        str1 = sortString(str1);
        str2 = sortString(str2);

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                 return  false;
            }
        }
        return  true;
    }



       static String sortString(String str){

           char [] ch = str.toCharArray();

           Arrays.sort(ch);

           String result = String.valueOf(ch);

           return  result;
       }

}
