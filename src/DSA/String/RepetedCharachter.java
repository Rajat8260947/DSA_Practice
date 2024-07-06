package DSA.String;

import java.util.HashMap;
import java.util.Map;

public class RepetedCharachter {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        printrepeat(str);
    }
    public static  void printrepeat(String str ){
        int len = str.length();
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i <len ; i++) {
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }
            else {
                map.put(str.charAt(i),1);
            }

        }

        for(Map.Entry<Character,Integer> entry :map.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey() + ", count = " + entry.getValue());
            }

        }
    }

}
