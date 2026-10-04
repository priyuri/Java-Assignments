public class Assignment12 {
    //example print n to 1 using recursion 
    public static void printNos(int n) {
        // code here
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printNos(n-1);
    }

    //example print 1 to n using recursion 
    public static  void printTillN(int n) {
        // code here
        if(n == 1){
            System.out.print(n+" ");
            return;
        }
        printTillN(n-1);
        System.out.print(n+" ");

    }
    //example Find the factorial of n.
    public static int factorial(int n) {
        // code here
        if(n == 1 || n == 0){
            return  1;
        }
        int nm1 = factorial(n-1);
        return n * nm1;

    }
    
    public static  int NnumbersSum(int N) {
        // your code goes here
        // int sum=0;
        // if(N == 0){
        //     return 0;
        // }
        // for(int i=1; i<=N; i++){
        //     sum+=i;
        // }
        // return sum;
        
        if(N == 1){
            return 1;
        }
        int nm1 = NnumbersSum(N-1);
        int sum = nm1 + N;
        return sum;
        
    }

    public static  int arraySum(int[] nums) {
        // your code goes here
        return sum(nums , 0);

    }
    private static  int sum(int[] nums , int i){
        if(i == nums.length){
            return 0;
        }
        int sum = nums[i] + sum(nums , i+1);
        return sum;
    }

    public static  int fib(int n) {
        // your code goes here
        if(n == 0 || n == 1){
            return n;
        }
        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        return fnm1 + fnm2;
    }
    public static void main(String[] args) {
        int n=3;
        // printNos(n);
        // printTillN(n);
        // System.out.println(factorial(n));
        // System.out.println(NnumbersSum(n));
        // int[] nums = {5,8,1};
        // System.out.println(arraySum(nums));
        System.out.println(fib(n));


    }
}
