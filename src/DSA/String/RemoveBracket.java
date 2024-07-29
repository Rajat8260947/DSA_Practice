package DSA.String;

public class RemoveBracket {
    public static void main(String[] args) {
        String s = "{(a+b)}=c";
         String result = s.replaceAll("[(){}]","");
        System.out.println(result);
    }
}
