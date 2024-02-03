package DSA.Hashmap;

import java.util.HashMap;

public class Intialisation {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        // Insert - O(1)
        hm.put("india",100);
        hm.put("china",150);
        hm.put("Us",50);

        System.out.println(hm);

        // get

        int population = hm .get("india");
        String  popu= String.valueOf(hm.get("indonesia"));
        System.out.println(popu);
        System.out.println(population);


        //ContainsKey = O(1) // return Boolean;

        System.out.println(hm.containsKey("india"));
        System.out.println(hm.containsKey("indonesia"));


        // remove - O(1)
        System.out.println(hm.remove("china"));
        System.out.println(hm);


//        Size

        System.out.println(hm.size());

        // Is Empty
        System.out.println(hm.isEmpty());


        // clear
        hm.clear();
        System.out.println(hm.isEmpty());
    }

}
