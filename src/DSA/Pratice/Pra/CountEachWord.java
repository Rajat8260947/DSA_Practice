package DSA.Pratice.Pra;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class CountEachWord {
    public static void main(String[] args) {
        String str  = "the quick brown fox jumps over the lazy dog";

        String [] words =  str.split(" ");

        HashMap<String,Integer> map = new HashMap<>();

        for(String it : words){
            map.put(it,map.getOrDefault(it,0)+1);
        }

        for(String it : map.keySet()){
            System.out.print(   it  + " " +map.get(it) + " ");
        }

    }
}
