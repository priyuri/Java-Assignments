public class FriendsPair {
    public static int friendspairing(int n){
        if(n == 1 || n == 2){
            return n;
        }
        // single
        int fnm1 = friendspairing(n-1);
        int fnm2 = friendspairing(n-2);
        int ways = (n-1) * fnm2;
        int totalWays = fnm1 + ways;
        return totalWays;
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(friendspairing(n));
    }
}
