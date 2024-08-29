package DSA.String;

import java.sql.ResultSet;
//import java.util.Arrays;
//
//public class AnagramChecker {
//    public static void main(String[] args) {
//        String str1 = "listen";
//        String str2 = "silent";
//        boolean result = Check(str1, str2);
//        if(result==true){
//            System.out.println("Two String are Anagram");
//        }
//        else {
//            System.out.println("Not Anagram");
//        }
//
//    }
//
//
//    static boolean Check(String str1, String str2) {
//        if (str1.length() != str2.length()) {
//            return false;
//        }
//        str1 = sortString(str1);
//        str2 = sortString(str2);
//
//        for (int i = 0; i < str1.length(); i++) {
//            if (str1.charAt(i) != str2.charAt(i)) {
//                 return  false;
//            }
//        }
//        return  true;
//    }
//
//
//
//       static String sortString(String str){
//
//           char [] ch = str.toCharArray();
//
//           Arrays.sort(ch);
//
//           String result = String.valueOf(ch);
//
//           return  result;
//       }
//
//}
import  java.util.*;
class  Reapeat{

    static boolean IsAnagram(String s1, String s2){
        char  [] ch1= s1.toCharArray();
        char  [] ch2= s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return  Arrays.equals(ch1,ch2);
    }

    public  static void main (String [] args){
        String  s1  = "silent";
        String  s2  = "listen";
        if(s1.length() != s2.length()){
            System.out.println("Not ananjsj");
        }
        else {
            if (IsAnagram(s1, s2)) {
                System.out.println("Two string are anagram");
            } else {
                System.out.println("Two string are not anagram");
            }
        }
    }
}
