package DSA.String;

public class Length {
    public static void main(String[] args) {
        int length =0;
        String s = "prepInsta";

        for (char cl : s.toCharArray()) {
            length++;
        }
        System.out.println("Length of string is :" + length);
    }
}
