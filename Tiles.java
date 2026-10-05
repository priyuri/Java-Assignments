public class Tiles {
    public static  int tillingProblem(int n){
        // 4 * n  
        int totalways = 0;
        
        if(n == 0 || n == 1){
            return 1;
        }
        //vertically place
        int nm1 = tillingProblem(n-1);
        
        //horizontally place
        if(n >= 4){
            int nm2 = tillingProblem(n - 4);
            totalways = nm1 + nm2;
            return totalways;
        }
        return  nm1;
    }
    public static  int tillingProblem2(int n){
        // 2 * n
        if(n == 0 || n==1){
            return 1;
        }
        //vertically place
        int nm1 = tillingProblem2(n-1);
        //horizontally place
        int nm2 = tillingProblem2(n-2);
        return nm1 + nm2;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(tillingProblem(n));
        System.out.println(tillingProblem2(n));
    }
}
