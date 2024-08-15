package DSA.String;
//Count number of vowels, consonants, spaces in String

public class Count {
    public static void main(String[] args) {
      String str = "Take u forward is Awesome";
        str =str.toLowerCase();
      int vowels=0,consonants=0,space=0;
        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);

            if(ch =='a' || ch =='e'|| ch =='i' ||ch =='o' || ch =='u'){
                vowels++;

            } else if (ch >= 'a' && ch <='z' ) {
                consonants++;

            } else if (ch == ' ') {
                space++;
            }

        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("White spaces: " + space);


    }
}
