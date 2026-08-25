import java.util.*;
public class Assignment3 {
    //leetcode problem sumofmultiples

    public static int sumOfMultiple(int n){
        int sum=0;
        for(int i=1; i<=n; i++){
            if(i%3==0 || i%5==0 || i%7==0){
                sum+=i;
            }
        }
        return sum;

    }

    public static void main(String[] args) {
        int n = 9;
        System.out.println(sumOfMultiple(n));
        // Write a program that reads a set of integers , and then prints the sum of the even and odd integers.

        Scanner sc = new Scanner(System.in);
        int num;
        int sumOdd = 0;
        int sumEven = 0;
        int ch = 1;

        do{
            System.out.print("Enter the number: ");
            num = sc.nextInt();
            if(num%2 == 0){
                sumEven += num;
            }else{
                sumOdd += num;
            }

            System.out.print("Do you want to continue if yes then press 1 otherwise press 0 : ");
            ch = sc.nextInt();

        }while(ch == 1);
        System.out.println("Sum of even numbers: "+sumEven);
        System.out.println("Sum of odd numbers: "+sumOdd);

        // Write a program to find the factorial of any number entered by the user

        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        int fact = 1;
        for(int i=1; i<=number; i++){
            if(number == 0){
                System.out.println("The factorial of " + number + " is 1");
            }
            fact *= i;
        }
        System.out.println("The factorial of "+number+" is "+fact);

        // Write a program to print the multiplication table of a number N,entered by the user

        int num3 = sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.print(num3 * i +" ");
        }

    }
}
