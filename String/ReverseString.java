import java.util.Arrays;
import java.util.List;

public class ReverseString{
    public static  void reverseString(List<Character> s) {
        //your code goes here
        int i=0 , j = s.size()-1;
        while(i<j){
            int temp = s.get(i);
            s.get(i) = s.get(j);
            
        }

    }
    public static void main(String[] args) {
        List<Character> s = Arrays.asList('h', 'e' ,'l' ,'l' ,'o');
        reverseString(s);
        
    }
}