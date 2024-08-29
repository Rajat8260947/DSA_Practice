package DSA.Pratice.String1;

import java.util.Arrays;

public class ReverseAWordInAString {
    public static void main(String[] args) {

               String s = "Geeks For Geeks krs";
                String[] arr = s.trim().split("\\s+");
                System.out.println(Arrays.toString(arr));
                int i=0,j=arr.length-1;
                while(i<j) {
                    String t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                    i++;
                    j--;
                }
        System.out.println(Arrays.toString(arr));
        System.out.println(String.join(" ", arr));

//        String vowels = "a::b::c::d:e";
//
//        // splitting the string at "::"
//        // storing the result in an array of strings
//        String[] result = vowels.split("::");
//
//
//        // converting array to string and printing it
//        System.out.println("result = " + Arrays.toString(result));
//        String text = "Hello  World   How are  you?";
//        String[] words = text.split("\\s+");
//
//        for (String word : words) {
//            System.out.println(word);
//        }
    }
            }





