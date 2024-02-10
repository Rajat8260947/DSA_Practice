package DSA.Array;

import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "tulip";
        String str2 = "lipid";
        Boolean ans = ValidAnagram(str1,str2);
        System.out.println(ans);
    }
    static  Boolean ValidAnagram (String str1 , String str2){
        HashMap<Character,Integer> map = new HashMap<>();

        for (int i = 0; i<str1.length() ; i++) {
            map.put(str1.charAt(i),map.getOrDefault(str1.charAt(i),0) +1);
        }
        for (int i = 0; i<str2.length() ; i++){
            char  ch = str2.charAt(i);
            if(map.get(ch)!= null){
                if (map.get(ch)==1){
                    map.remove(ch);
                }
                else{
                    map.put(ch,map.get(ch)-1);
                }

            }
            else {
                 return  false;
            }

        }




        return  map.isEmpty();
    }
}
