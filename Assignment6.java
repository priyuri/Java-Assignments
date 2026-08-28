import java.util.*;
public class Assignment6 {
    //problem 1 Write a Java method to compute the average of three numbers.
    public static void calcAvg(float a , float b , float c){
        float avg = (a + b + c)/3;
        System.out.println(avg);
    }

    //problem 2 Write a method named isEven that accepts an int argument.The method should return true if the argument is even , or false otherwise.Also write a program to test your method.
    public static boolean isEven(int n){
        if(n % 2 == 0){
            return true;
        }else{
            return false;
        }

    }

    //problem 3 WAP to check if the number is palindrome or not
    public static void isPalindrome(int n){
        int rev = 0;
        int original = n;
        while(n>0){
            int lastDigit = n % 10;
            rev = (rev * 10) + lastDigit;
            n = n/10;
        }
        if(original == rev){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }

    //problem 4 Explore Math methods
    public static void calc(int a , int b){
        System.out.println(Math.max(a , b));
        System.out.println(Math.min(a , b));
        System.out.println(Math.multiplyExact(a, b));
        System.out.println(Math.addExact(a , b));
        System.out.println(Math.abs(b));
        System.out.println(Math.sqrt(a));
    }

    //problem 5 Write a Java method to compute the sum of the digits in an integer
    public static int sumOfDigits(int num){
        int sum = 0;
        while(num>0){
            int lastDigit = num % 10;
            sum = sum + lastDigit;
            num = num / 10;
        }
        return sum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three numbers");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        calcAvg(a, b, c);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.println(isEven(n));

        int m = 121;
        isPalindrome(m);

        int a1 = 100;
        int b1 = 20;
        calc(a1, b1);

        int num = 1235;
        int ans = sumOfDigits(num);
        System.out.println("The sum of digits in number is : "+ans);


        
    }
}
