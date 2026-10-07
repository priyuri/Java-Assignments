public class Assignment13 {
    // Sum of Digits in a Given Number using recursion
    public static int addDigits(int num) {
        return addDigits(num, 0);
    }

    public static int addDigits(int num, int sum) {
        // your code goes here
        if (num == 0) {
            return redSum(sum);
        }
        int ld = num % 10;
        sum += ld;
        num = num / 10;
        return addDigits(num, sum);
    }

    public static int redSum(int sum) {
        while (sum > 9) {
            int newSum = 0;
            while (sum > 0) {
                int ld = sum % 10;
                newSum += ld;
                sum = sum / 10;
            }
            sum = newSum;
        }
        return sum;

    }

    //For a given integer array of size N. You have to find all the occurrences (indices) of a given element (Key) and print them. Use a recursive function to solve this problem
    // Sample Input : arr[ ] = {3, 2, 4, 5, 6, 2, 7, 2, 2}, key = 2
    // Sample Output : 1 5 7 8
    public static void getOccurencesIdx(int[] arr , int key , int idx){
        if(idx == arr.length){
            return;
        }
        if(arr[idx] == key){
            System.out.print(idx+" ");
        }
        getOccurencesIdx(arr, key, idx+1);

    }

    //You are given a number (eg - 2019), convert it into a String of english like “two zero one nine”. Use a recursive function to solve this problem. NOTE - The digits of the number will only be in the range 0-9 and the last digit of a number can’t be 0.

    // Sample Input : 1947 Sample Output : “one nine four seven”
    public static void getEnglishWords(int num){
        String[] words = {"zero" , "one" , "two" , "three" , "four" , "five" , "six" , "seven" , "eight" , "nine"};
        if(num == 0){
            return;
        }
        int lastdigit = num % 10;
        getEnglishWords(num/10);
        System.out.print(words[lastdigit]+" ");
    }
    // Write a program to find Length of a String using Recursion
    public static int getLength(String str , int idx , int count){
        if(idx == str.length()){
            return count;
        }
        return getLength(str, idx+1  , count+1);  
    }
    //Question 4 : We are given a string S, we need to find the count of all contiguous substrings starting and ending with the same character. 
    // Sample Input 1 : S = "abcab" 
    // Sample Output 1 : 7 
    // There are 15 substrings of "abcab" : a, ab, abc, abca, abcab, b, bc, bca, bcab, c, ca, cab, a, ab, b Out of the above substrings, there are 7 substrings : a, abca, b, bcab, c, a and b. So, only 7 contiguous substrings start and end with the same character.

    
    



    public static void main(String[] args) {
        // int num = 2147483647;
        // int sum = 0;
        // System.out.println(addDigits(num, sum));
        // int[] arr = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        // getOccurencesIdx(arr, 2, 0);
        // getEnglishWords(2002);
        String str = "mayu";
        System.out.println(getLength(str, 0 , 0));

    }
}
