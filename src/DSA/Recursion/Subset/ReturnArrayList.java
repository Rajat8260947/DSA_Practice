package DSA.Recursion.Subset;

import java.util.ArrayList;
import java.util.Arrays;

public class ReturnArrayList {
    public static void main(String[] args) {
        ArrayList<String> ans = SubSeq("","abc");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");

        }

    }
    static ArrayList<String> SubSeq(String p,String up){
        if (up.isEmpty()){
            ArrayList<String> list= new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left= SubSeq(p+ch,up.substring(1));
        ArrayList<String> right= SubSeq(p,up.substring(1));

        left.addAll(right);

        return left;

    }
}
