import java.util.*;
public class armstrong {
    public static boolean isArmstrong(int n) {
        int sum = 0;
        int original = n;
        int count = (n == 0) ? 1 : (int) Math.log10(n) + 1;
        while(n>0){
            int lastDigit = n%10;
            sum =sum + (int )Math.pow(lastDigit, count);
            n = n/ 10;
        }
        if(original == sum){
            return true;
        }else{
            return false;
        }

    }
    public static void main(String[] args) {
        int n = 12;
        System.out.println(isArmstrong(n));
    }
}
