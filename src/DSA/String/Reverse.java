package DSA.String;

public class Reverse {
    public static void main(String[] args) {
        String s ="madam";
//        StringBuilder sb = new StringBuilder(s);
////        sb.append(s);
//        sb.reverse();
//        System.out.println(sb);
          String temp = "";
        for (int i = 0; i < s.length() ; i++) {

              temp = s.charAt(i) + temp;

        }
         if(temp.equals(s)){
             System.out.println("String is pallindrom");
         }
         else {
             System.out.println("Not palindrom");
         }
//        System.out.println(temp);
    }
}
