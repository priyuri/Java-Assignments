import java.util.Arrays;

public class InsertionSort {
    public static  int[] insertionSort(int[] nums) {
        for(int i=1; i<nums.length; i++){
            int temp = nums[i];
            int prev = i-1;
            while(prev >= 0 && nums[prev] > temp){
                nums[prev+1] = nums[prev];
                prev--;
            }
            nums[prev+1] = temp;
        }
        return nums;

    }
    public static void main(String[] args) {
        int[] nums = {7, 4, 1, 5, 3};
        insertionSort(nums);
        System.out.println(Arrays.toString(nums));
        
    }
}
