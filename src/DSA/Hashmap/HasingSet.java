package DSA.Hashmap;

import java.util.HashSet;
import java.util.Iterator;

public class HasingSet {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();

        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("chennai");
        cities.add("Benagulur");
        cities.add("Bhubaneswar");

//        Iterator it = cities.iterator();

//        while (it.hasNext()){
//            System.out.println(it.next());
//        }


         for(String city : cities){
             System.out.println(city);
         }
        
    }
}
