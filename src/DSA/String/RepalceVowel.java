package DSA.String;

public class RepalceVowel {
    public static void main(String[] args) {
        String  str = "prepinsta";
        String str1  = "";
        str1 = str.replaceAll("[aeiou]","");
        System.out.println("String after removing vowel   " +  str1);
    }
}
