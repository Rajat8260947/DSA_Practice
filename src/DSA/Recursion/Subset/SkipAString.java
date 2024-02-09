package DSA.Recursion.Subset;
// skip a string if it is not required
public class SkipAString {
    public static void main(String[] args) {
        String str = "abcappleapp";

        String ans = Skip(str);
        System.out.println(ans);
    }


    static  String Skip(String str){
        if(str.isEmpty()){
            return  "";
        }
        if(str.startsWith("app") && !str.startsWith("apple")){
            return  Skip(str.substring(3));
        }
        return str.charAt(0)+Skip(str.substring(1));
    }
}
