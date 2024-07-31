package DSA.String;

public class Toggle {
    public static void main(String[] args) {
        String str = "PeRepInsta";
        String str1 = "";

        for (int i = 0; i <str.length() ; i++) {
            if(Character.isUpperCase(str.charAt(i))){
                str1+=Character.toLowerCase(str.charAt(i));
            }
            else {
                str1+=Character.toUpperCase(str.charAt(i));

            }

        }
        System.out.println(str);
        System.out.println(str1);
    }
}
