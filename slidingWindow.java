public class slidingWindow {
    public static int getMax(int[] arr , int k){
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < k; i++) {
            sum = sum + arr[i];
            max = sum;
        }
        for (int i = 1; i <= arr.length - k; i++) {
            sum = sum - arr[i - 1] + arr[i + k - 1];
            if (max < sum) {
                max = sum;
            }
        }
        return max;

    }
    public static  int getMin(int[] arr , int k){
        int sum=0;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<k; i++){
            sum += arr[i];
            min = sum;
        }
        for(int i=1; i<arr.length-k; i++){
            sum = sum - arr[i-1] + arr[i+k-1];
            if(min > sum){
                min = sum;
            }
        }
        return min;
    }
    public static void getAvg(int[] arr , int k){
        int sum = 0;
        float avg = 0;

        for (int i = 0; i < k; i++) {
            sum = sum + arr[i];
        }
        avg = sum / k;
        System.out.println(avg);
        for (int i = 1; i <= arr.length - k; i++) {
            sum = sum - arr[i - 1] + arr[i + k - 1];
            avg = sum/k;
            System.out.println(avg);
            
        }
    }
    public static  int countWindow(int[] arr , int k , int target){
        int count = 0;
        int sum = 0;
        for(int i=0; i<k; i++){
            sum += arr[i];
        }
        if(sum > target){
            count++;
        }
        for(int i=1; i<=arr.length-k; i++){
            sum = sum - arr[i-1] + arr[i+k-1];
            if(sum > target){
                count++;
            }
        }
        return count;

    }

    // Maximum Number of Even Elements in a Window of Size K
    public static int maxEvenNum(int[] arr , int k){
        int count = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<k; i++){
            if(arr[i] % 2 == 0){
                count++;
            }
        }
        if(max < count){
            max = count;
        }
        for(int i=1; i<=arr.length-k; i++){
            if(arr[i-1] % 2 == 0){
                count--;
            }
            if(arr[i + k -1] % 2 == 0){
                count++;
            }
            if(max < count){
                max = count;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = { 2, 1, 4, 6, 4, 8};
        int k=3;
        // System.out.println(getMax(arr, k));
        // System.out.println(getMin(arr, k));
        // getAvg(arr, k);
        // int target = 7;
        // System.out.println(countWindow(arr, k, target));
        System.out.println(maxEvenNum(arr, k));

    }
}
