package DSA.Pratice.Pra;

import java.util.ArrayList;
import java.util.HashSet;

public class Intersection {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,45,4,5};
        int [] arr2 = {1,2,5};

        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer>  st= new HashSet<>();

        for(int it :  arr1){
            st.add(it);
        }

        for (int it: arr2) {

            if(st.contains(it)){
                list.add(it);
            }
        }
        System.out.println(list);
    }
}
