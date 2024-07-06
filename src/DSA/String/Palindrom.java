package DSA.String;

public class Palindrom {
    public static void main(String[] args) {
//        String str = "radar";
//         Boolean pali = result(str);
//        System.out.println(pali);
//
//    }
//    static Boolean result(String str ){
//        int start = 0;
//        int end = str.length()-1;
//
//        while(start<end) {
//
//            if(str.charAt(start) != str.charAt(end)){
//                  return  false;
//            }
//                start++;
//                end--;
//        }
//        return  true;

        // or
        String  s  = "radar";

        String  rev = "";

        for (int i = s.length()-1; i >=0; i--) {

            rev = rev +s.charAt(i);

        }
        if(s.equals(rev)){
            System.out.println("String is palindrome");
        }
        else {
            System.out.println("String is not Palindrome");
        }
    }
}
