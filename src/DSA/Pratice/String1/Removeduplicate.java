package DSA.Pratice.String1;

import java.util.Arrays;
import java.util.HashSet;

public class Removeduplicate {
    public static void main(String[] args) {


        String  str = "bcabc";
//        char [] ch = str.toCharArray();
//        Arrays.sort(ch);
//        System.out.println(Arrays.toString(ch));
//        int i=0;
//        for (int j = 1; j < ch.length; j++) {
//            if(ch[j]!=ch[i]){
//                i++;
//                ch[i]=ch[j];
//                System.out.println(ch[i]);
//            }
//
//        }
//
//        for (int k = 0; k <i+1; k++) {
//            System.out.print(ch[k]);
//
//        }


          // set

//        HashSet<Character> st = new HashSet<>();
//
//        for(int i =0; i<str.length();i++){
//            st.add(str.charAt(i));
//        }
//
//        String s = "";
//
//        for (char c: st){
//              s+=c;
//        }
//        System.out.println(s);

        String str1 = "takeuforward";
        //convert to character array
        char charArr[] = str1.toCharArray();
        //sort the character array
        Arrays.sort(charArr);
        System.out.println(Arrays.toString(charArr));;
        String ans = "";
        for (int i = 0; i < str.length(); i++) {

            int j =0;
            for (j = 0; j <i ; j++) {
                if(str.charAt(i)==str.charAt(j)){
                    break;
                }

            }

            if(i==j){
                ans =ans+str.charAt(i);
            }

        }
        System.out.println(ans);

    }
}
