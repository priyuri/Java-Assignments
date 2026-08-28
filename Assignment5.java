import java.util.*;

public class Assignment5 {
    // problem 1 find product of a and b using function
    public static int product(int a, int b) {
        int prod = a * b;
        return prod;
    }

    // problem 2 find factorial of a number by using function
    public static int factorial(int m) {
        int fact = 1;
        for (int i = 1; i <= m; i++) {
            fact = fact * i;
        }
        return fact;

    }

    // problem 3 calculate binomial coefficient of a number
    public static int BinoCoeff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);

        int cal = fact_n / (fact_r * fact_nmr);
        return cal;

    }

    // problem 4 program to check a number is prime or not
    public static boolean isPrime(int n) {
        boolean isPrime = true;
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
            }
        }
        return isPrime;

    }

    // problem 5 print all prime numbers in range till n
    public static void primeInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

    }

    // problem 6 program to convert binary number to decimal number
    public static void binaryToDecimal(int n) {
        int pow = 0;
        int decimal = 0;
        int original = n;

        while (n > 0) {
            int lastDigit = n % 10;
            decimal = decimal + lastDigit * (int) Math.pow(2, pow);
            pow++;
            n = n / 10;
        }
        System.out.println("The binary number " + original + " is converted into Decimal number which is " + decimal);

    }

    // problem 7 program to convert decimal number into the binary number
    public static void decimalToBinary(int n) {
        int pow = 0;
        int binary = 0;
        int original = n;
        while (n > 0) {
            int rem = n % 2;
            binary = binary + rem * (int) Math.pow(10, pow);
            pow++;
            n = n / 2;
        }
        System.out.println("The decimal number " + original + " is converted into binary number i.e. " + binary);

    }

    public static void main(String[] args) {

        int a = 5;
        int b = 20;
        int ans = product(a, b);
        System.out.println(ans);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int m = sc.nextInt();
        int ans1 = factorial(m);
        System.out.println(ans1);

        int n = 5;
        int r = 2;
        System.out.println(BinoCoeff(n , r));

        int p = 5 ;
        System.out.println(isPrime(p));

        int k = 10;
        primeInRange(k);

        int c = 111;
        binaryToDecimal(c);

        int d = 7;
        decimalToBinary(d);

    }
}
