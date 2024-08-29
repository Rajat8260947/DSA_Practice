package DSA.String;

public class ReplaceExceptCharacter {
    public static void main(String[] args) {
         String str = "take12% *&u ^$#forward";
        String input1 = "a+((b-c)+d)";
        String result = input1.replaceAll("[{}()]","");
        System.out.println(result);
         int n = str.length();

         String temp = "";

         for (int i = 0; i <n ; i++) {

             char ch = str.charAt(i);

             if(ch>=65 && ch<=90 || ch>=97 && ch<=122){
                 temp =temp+ch;
             }

         }
         System.out.println(temp);

     }
}
