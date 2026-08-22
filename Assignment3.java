public class Assignment3 {
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
    }
}
