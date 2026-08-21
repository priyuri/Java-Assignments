
import java.util.*;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //problem 1  Income tax calculator
        int tax;
        int income = sc.nextInt();
        if (income < 500000) {
            tax = 0;
        } else if (income >= 500000 && income < 1000000) {
            tax = (int) (income * 0.2);
        } else {
            tax = (int) (income * 0.3);
        }
        System.out.println("Your tax is : "+tax);

        //problem 2 find the largest number of 3 numbers
        int a = 10 , b = 50, c = 15;
        if(a>=b && a>=c){
            System.out.println("a is largest");
        }else if(b>=c){
            System.out.println("b is largest");
        }else{
            System.out.println("c is largest");
        }

        // problem 3 Write a Java program to get a number from the user and print whether it is positive or negative.

        int num = sc.nextInt();
        if(num>=0){
            System.out.println("The number is Positive");
        }else{
            System.out.println("The number is negative");
        }

        // problem 4 Finish the following code so that it prints You have a fever if your temperature is above 100 and otherwise prints You don't have a fever.

        double temperature = 90;
        if(temperature>=100){
            System.out.println("I have a fever");
        }else{
            System.out.println("Oooh no , I don't have fever");
        }

        //problem 5 Write a Java program to input week number (1-7) and print day of week name using switch case.

        System.out.print("Enter the week number: ");
        int weekNum = sc.nextInt();
        switch(weekNum){
            case 1: System.out.println("Monday");
                    break;
            case 2: System.out.println("Tuesday");
                    break;
            case 3: System.out.println("Wednesday");
                    break;
            case 4: System.out.println("Thursday");
                    break;
            case 5: System.out.println("Friday");
                    break;
            case 6: System.out.println("Saturday");
                    break;
            case 7: System.out.println("Sunday");
                    break;
            default: System.out.println("Invalid week number");
        }

        //problem 6  Write a Java program that takes a year from the user and print whether that year is a leap year or not.

        int year = sc.nextInt();
        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = (year % 100 == 0) && (year % 400 == 0);

        if(x && (y || z)){
            System.out.println(year +" is a leap year");
        }else{
            System.out.println(year +"is not a leap year");
        }

    }
}
