package DSA.String;

public class Capitalize {
    public static void main(String[] args) {
        String str = "take u forward is awesome";

        for (int i = 0; i <str.length() ; i++) {

            char ch= str.charAt(i);

            if(ch==' '){
                str= String.valueOf(str.charAt(i+1)).toUpperCase();
            }

        }
        System.out.println(str);
    }
}
