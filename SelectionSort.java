import java.util.Arrays;

public class SelectionSort {
    public static  int[] selectionSort(int[] nums) {
        for(int i=0; i<nums.length-1; i++){
            int minValue = i;
            for(int j=i+1; j<nums.length; j++){
                if(nums[minValue] > nums[j]){
                    minValue = j ;
                }
            }
            //swap
            int temp = nums[minValue];
            nums[minValue] = nums[i];
            nums[i] = temp;
        }
        return nums;

    }
    public static void main(String[] args) {
        int[] nums = {7, 4, 1, 5, 3};
        selectionSort(nums);
        System.out.println(Arrays.toString(nums));
        
    }
}
