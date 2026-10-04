import java.util.*;
public class Assignment11 {
    public static int getMax(int[] arr){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static int getMin(int[] arr){
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(smallest > arr[i]){
                smallest = arr[i];
            }
        }
        return smallest;

    }

    public static int linearSearch(int[] arr1 , int target){
        for(int i=0; i<arr1.length; i++){
            if(arr1[i] == target){
                return i;
            }
        }
        return -1;

    }

    public static int findOcurrences(int[] arr2 , int target2){
        int count = 0;
        for(int i=0; i<arr2.length; i++){
            if(arr2[i] == target2){
                count++;
            }
        }
        return count;
    }

    public static  int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = i + 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }

    public static  void moveZeroes(int[] nums) {
        int i=0 ;
        for(int j=0; j<nums.length; j++){
            if(nums[j] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void leftRotate(int[] arr3){
        for(int i=0; i<arr3.length-1; i++){
            int temp = arr3[i];
            arr3[i] = arr3[i+1];
            arr3[i+1] = temp;
        }
        System.out.println(Arrays.toString(arr3));
    }

    public static int secondLargestElement(int[] nums2) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i=0; i<nums2.length; i++){
            int current = nums2[i];
            if(largest < current){
                secondLargest = largest;
                largest = current;
            }else if(secondLargest != largest && current > secondLargest && current != largest){
                secondLargest = current;
            }
        }
        if(secondLargest == Integer.MIN_VALUE){
            return -1;
        }
        return secondLargest;

    }

    public static int secondSmallest(int[] nums3){
        int smallest = Integer.MAX_VALUE;
        int secondsmallest = Integer.MAX_VALUE;
        for(int i=0; i<nums3.length; i++){
            int current = nums3[i];
            if(smallest > current){
                secondsmallest = smallest;
                smallest = current;
            }else if(current != smallest && current < secondsmallest){
                secondsmallest = current;
            }
        }
        return secondsmallest;

    }

    
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7};
        // System.out.println(getMax(arr));
        // System.out.println(getMin(arr));

        // int[] arr1 = {10,20,30,40,50};
        // int target = 60;
        // System.out.println(linearSearch(arr1, target));

        // int[] arr2 = {2, 5, 2, 8, 2, 9,9};
        // int target2 = 2;
        // System.out.println(findOcurrences(arr2, target2));

        // int[] nums = {1, 1, 2, 2, 3, 4, 4};
        // System.out.println(removeDuplicates(nums));

        // int[] nums = {0};
        // moveZeroes(nums);

        // int[] arr3 = {1, 2, 3, 4, 5};
        // leftRotate(arr3);

        // int[] nums2 = { 8, 8, 4,9};
        // System.out.println(secondLargestElement(nums2));

        int[] nums3 = {10, 5, 8, 20, 15};
        System.out.println(secondSmallest(nums3));


    }
}
