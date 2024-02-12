package DSA.Hashmap;

import java.util.HashMap;
import java.util.HashSet;

public class ItinaryOrJourney {
    public static void main(String[] args) {
        HashMap<String,String> tickets = new HashMap<>();
        tickets.put("Chennai","Bengaluru");
        tickets.put("Mumbai","Delhi");
        tickets.put("Goa","Chennai");
        tickets.put("Delhi","Goa");
        String start = getStart(tickets);
        System.out.print(start);
        for (String key : tickets.keySet()){
            System.out.print("->" + tickets.get(start));
            start = tickets.get(start);
        }
        System.out.println();
    }

    static   String  getStart(HashMap<String,String> tickets){
        HashMap<String,String> rev = new HashMap<>();

        for(String key : tickets.keySet()){
            rev.put(tickets.get(key),key);
        }
        for(String key : tickets.keySet()){
            if(!rev.containsKey(key)){
                return key;
            }
        }

        return  null;

    }

}
