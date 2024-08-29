package DSA.Pratice.String1;

import java.util.HashSet;

public class RemoveCharacter {
    public static void main(String[] args) {
        String str1 = "abcdef";
        String str2 = "cefz";
        HashSet<Character> s= new HashSet<>();

        for (int i = 0; i < str1.length(); i++) {

            char ch = str1.charAt(i);
            s.add(ch);
            
        }

        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            if(s.contains(ch)){
                s.remove(ch);
            }

        }
         String  temp ="";

        for (char it :s) {
             temp = temp+it;
        }
        System.out.println(temp);

    }
}
