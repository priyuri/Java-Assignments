import java.util.Scanner;

public class Assignment4 {

    public static void printPattern(int num3){
        for(int i=1; i<=num3; i++){
            // for incr order
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            // for decr order
            for(int k=i-1; k>=1; k--){
                System.out.print(k);
            }
            System.out.println();
        }
    }

    public static void printPattern2(int num1){
        for(int i=num1; i>=1; i--){
            for(int j=num1; j>=i; j-- ){
                System.out.print(j);
            }
            for(int k=i+1; k<=num1; k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }

    public static void printPattern3(int num2){
        for(int i=1; i<=num2; i++){
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            for(int k=2; k<=i; k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        // inverted pattern
        
        int n = 4;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // example 2 hollow rectangle pattern
        int m = 5;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || j == 1 || i == m || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // example 3 inverted and rotated half pyramid pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // example 4 Inverted half pyramid with number system
        for (int i = m; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // example 5 floyd's triangle pattern
        int num = 1;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }

        // example 6 - 0-1 traingle pattern
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }

        // example 7 Butterfly pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= (n - i) * 2; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= (n - i) * 2; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // example 8 solid rhombus pattern
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= (m - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= m; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // problem 9 number pyramid pattern
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= (m - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        // problem 10 diamond pattern
        // upper part
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // lower part
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // problem 11 palindromic pattern with number pattern
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j < m - i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // problem 12 hollow rhombus
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= (m - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= m; k++) {
                if (i == 1 || k == 1 || i == m || k == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        } 

        //problem 13

        Scanner sc = new Scanner(System.in);
        int num3 = sc.nextInt();
        printPattern(num3);

        int num1 = sc.nextInt();
        printPattern2(num1);

        int num2 = sc.nextInt();
        printPattern3(num2);



    }
}