package DSA.Pratice.String1;

public class CamelCase {
    public static void main(String[] args) {
         String str =  "I got intern at geeksforgeeks";

         String  temp = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch==' '){
                char nextChar = Character.toUpperCase(str.charAt(i+1));
                System.out.println(str.substring(i+2));
                str = str.substring(0, i) + nextChar + str.substring(i+2);
                System.out.println(str);
            }

        }
        System.out.println(str);
    }
}
