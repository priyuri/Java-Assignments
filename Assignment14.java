public class Assignment14 {
    //example 1 TOWER OF HANOI
    public static void towerOfHanoi(int n, char src, char helper, char dest) {
        if (n == 1) {
            System.out.println("shift the " + n + " disk from " + src + " to " + dest);
            return;
        }
        towerOfHanoi(n - 1, src, dest, helper);
        System.out.println("shift the " + n + " disk from " + src + " to " + dest);
        towerOfHanoi(n - 1, helper, src, dest);

    }

    //example 2 You are given a number (eg -  2019), convert it into a String of english like “two zero one nine”.  Use a recursive function to solve this problem. NOTE- The digits of the number will only be in the range 0-9 and the last digit of a number can’t be 0. 
    // Sample Input : 1947 
    // Sample Output : “one nine four seven

    static  String[] arr = {"zero" , "one" , "two" , "three" , "four" , "five" , "six" , "seven" , "eight" , "nine"};
    public static void convertIntoString(int n){
        if(n == 0){
            return;
        }
        int lastdigit = n % 10;
        n = n / 10;
        convertIntoString(n);
        System.out.print(arr[lastdigit]+" ");
    }

    //example 3 For a given integer array of size N. You have to find all the occurrences (indices) of a given element (Key) and print them. Use a recursive function to solve this problem. 
    // Sample Input : arr[ ] = {3, 2, 4, 5, 6, 2, 7, 2, 2}, key = 2 
    // Sample Output : 1 5 7 8

    public static void findIndices(int[] arr , int key , int idx){
        if(idx == arr.length){
            return;
        }
        if(arr[idx] == key){
            System.out.print(idx+" ");
        }
        findIndices(arr, key, idx+1);
    }

    //example length of a string 
    public static int findLength(String s , int idx){
        if(idx == s.length()){
            return idx;
        }
        return findLength(s, idx+1);

    }



    public static void main(String[] args) {
        // int n = 2019;
        // convertIntoString(n);
        // towerOfHanoi(n, 'A', 'B', 'C');
        // int[] arr = {3 , 2 , 4, 5, 6, 2, 7, 2, 2};
        // int key = 2;
        // findIndices(arr , key , 0);
        String s = "kiya";
        System.out.println(findLength(s, 0));
    }

    
}
