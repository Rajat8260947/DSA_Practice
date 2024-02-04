package DSA.Recursion.Array;

public class IsSorted {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4};

        System.out.println(sorted(arr));
        System.out.println(recursion(arr,0));
    }
    static  Boolean sorted (int [] arr){
        Boolean flag = true;;
        for (int i = 0; i < arr.length-1; i++) {
            int j = i + 1;
            if (arr[i] > arr[j]) {
                flag = false;
                break;

            }
        }
            if(flag){
                return  true;
            }

        return  false;
        }

        // in recursion

        static  Boolean recursion(int [] arr, int index){


              if (index == arr.length-1){
                  return  true;
              }

             return  arr[index]<arr[index+1] && recursion(arr,index+1);

        }


    }

