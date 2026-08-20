//Problem 1 : In a program , input 3  numbers : A , B and C. You have to output the average of these 3 numbers.(Hint : Average of N numbers is sum of those numbers divided by N)

import java.util.*;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        float a = sc.nextInt();
        float b = sc.nextInt();
        float c = sc.nextInt();
        float avg = (a + b + c) / 3;
        System.out.println(avg);

        // Problem 2 In a program, input the side of a square. You have to output the area of the square. (Hint : area of a square is (side x side))

        int side = sc.nextInt();
        int area = side * side;
        System.out.println(area);

        // Problem 3 :Enter cost of 3 items from the user (using float datatype)- a pencil , a pen and an eraser. You have to output the total cost of the items back to the user as their bill.(Add on : You can also try adding 18% gst tax  to the items in the bill as an advanced problem

        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();

        float Gst_Of_Pencil = pencil * 0.18f;
        float Gst_Of_Pen = pen * 0.18f;
        float Gst_Of_Eraser = eraser * 0.18f;

        float GST_Amount = Gst_Of_Pencil + Gst_Of_Pen + Gst_Of_Eraser;

        float total_Bill = pencil + pen + eraser + GST_Amount;
        System.out.println(total_Bill);


    }
}









