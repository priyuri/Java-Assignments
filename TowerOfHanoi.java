public class TowerOfHanoi {
    public static void towerShift(int n , String source , String helper , String dest){
        if(n == 1){
            System.out.println("Transfer disk " + n + " from " + source + " to " + dest);
            return;
        }
        towerShift(n-1 , source , dest , helper);
        System.out.println("Transfer disk "+n+" from "+source+" to "+dest);
        towerShift(n-1, helper, source, dest);
    }
    public static void main(String[] args) {
        int n=3;
        towerShift(n, "A", "B", "C");
        
    }
}
