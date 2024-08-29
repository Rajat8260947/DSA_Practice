package DSA.Pratice.String1;

public class ChangeCase {
    public static void main(String[] args) {
        String str= "javA skkASn";
        String  temp = " ";
        for (int i = 0; i < str.length(); i++) {
             char ch = str.charAt(i);

            if(ch==' ')
                temp= temp+" ";
             else if (Character.isUpperCase(ch)){
                  temp=temp+Character.toLowerCase(ch);
            }
             else {
                temp=temp+Character.toUpperCase(ch);
            }

        }
        System.out.println(temp);
    }
}
