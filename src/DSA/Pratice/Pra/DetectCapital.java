package DSA.Pratice.Pra;

//public class DetectCapital {
//    public static void main(String[] args) {
//        String str = "UBA";
//         boolean flag = true;
//        for (int i = 0; i <str.length() ; i++) {
//            char ch = str.charAt(i);
//            if(Character.isLowerCase(ch)){
//                flag = false;
//
//            }
//
//        }
//     if(flag ==true){
//         System.out.println("true");
//     }
//     else {
//         System.out.println("false");
//     }
//    }



//}

class Solution {
    public static boolean detectCapitalUse(String word) {
        boolean allCap = false, firstCap = false, allSmall = false;

        if(word.charAt(0) >= 65 && word.charAt(0) <= 90){
            if(word.length() > 1 && word.charAt(1) >= 65 && word.charAt(1) <= 90)
                allCap = true;
            else
                firstCap = true;
        }
        else
            allSmall = true;
        for(int i = 1; i < word.length(); i++){
            if(allCap){
                if(word.charAt(i) < 65 || word.charAt(i) > 90)
                    return false;
            }
            if(firstCap){
                if(word.charAt(i) < 97 || word.charAt(i) > 122)
                    return false;
            }
            if(allSmall){
                if(word.charAt(i) < 97 || word.charAt(i) > 122)
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
         String str = "l";
        System.out.println(detectCapitalUse(str));

    }
}
