package DSA.Array;
// Find Smallest Letter Greater Than Target;
public class SmallestLetterByBInarySearch25 {
    public static void main(String[] args) {
        char [] arr ={'c','d','f','j'};
        char target = 'k';

        char ans = SmallestLetter(arr,target);
        System.out.println("The smallest letter is " + ans);
    }
    static  char SmallestLetter(char[]letters,int target){
//        if (target >= letters[letters.length - 1]) return letters[0];
//        int low = 0, high = letters.length - 1;
//        while (low <= high){
//            int mid = low + (high - low) / 2;
//
//            if (letters[mid] <= target) low = mid + 1;
//            else high = mid - 1;
//        }
//      return letters[low];
//
       // or
        int start = 0;
        int end = letters.length - 1;

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];


    }

}
