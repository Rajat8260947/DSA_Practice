package DSA.String;

import java.util.HashMap;
import java.util.Map;

public class NonRepatingCharacter {
    public static void main(String[] args) {
        String str = "Yahoo";

        HashMap<Character,Integer> map = new HashMap<>();

        for (int i = 0; i <str.length() ; i++) {

            char ch = str.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }

        }

          for (Map.Entry<Character,Integer> entry : map.entrySet()){
                if(entry.getValue()==1){
                    System.out.print(entry.getKey() + ",");
                }
          }
//
//          for (Character key : map.keySet()){
//               if(map.get(key) == 1){
//                   System.out.print(key + " ");
//               }
//          }
    }
}
