import java.util.*;

public class Assignment7 {

    // problem 1 how to update the values of array
    public static void updateValues(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] + 2;
        }

        // for printing array
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    // problem 2 LinearSearch
    public static int linearSearch(int numbers1[], int key) {
        for (int i = 0; i < numbers1.length; i++) {
            if (numbers1[i] == key) {
                return i;
            }
        }
        return -1;
    }

    // problem 3 find the largest and smallest element in an array
    public static int findLargest(int[] numbers2) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < numbers2[i]; i++) {
            if (largest < numbers2[i]) {
                largest = numbers2[i];
            }
        }
        return largest;

    }

    // problem 4 find smallest element in an array
    public static int findSmallest(int[] numbers3) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers3.length; i++) {
            if (smallest > numbers3[i]) {
                smallest = numbers3[i];
            }
        }
        return smallest;
    }

    // problem 5 find key by using linear search in array
    public static int linearSearch2(String[] menus, String key2) {
        for (int i = 0; i < menus.length; i++) {
            if (key2 == menus[i]) {
                return i;
            }
        }
        return -1;
    }

    // problem 6 find the value by using binary search
    public static int binarySearch(int[] numbers4, int key3) {
        int start = 0;
        int end = numbers4.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (numbers4[mid] == key3) {
                return mid;
            }
            if (numbers4[mid] < key3) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    // problem 7 reverse the array without using extra space
    public static void reverse(int[] numbers5) {
        int left = 0;
        int right = numbers5.length - 1;
        while (left < right) {
            int temp = numbers5[right];
            numbers5[right] = numbers5[left];
            numbers5[left] = temp;

            left++;
            right--;
        }

        for (int i = 0; i < numbers5.length; i++) {
            System.out.print(numbers5[i] + " ");
        }
        System.out.println();

    }

    // problem 8 find pairs in an array
    public static void pairsInArray(int[] numbers6) {
        int tp = 0;
        for (int i = 0; i < numbers6.length; i++) {
            for (int j = i + 1; j < numbers6.length; j++) {
                System.out.print("(" + numbers6[i] + "," + numbers6[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs in an array are : " + tp);
    }

    // problem 9 print the subarray of the array
    public static void subArray(int[] numbers7) {
        int ts = 0;
        for (int i = 0; i < numbers7.length; i++) {
            for (int j = i; j < numbers7.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print("[" + numbers7[k] + "]" + " ");
                    sum += numbers7[k];
                }
                System.out.println("sum = " + sum);

                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total number of subarray are : " + ts);
    }

    public static void main(String[] args) {
        int[] numbers = { 10, 15, 7, 9, 20 };
        updateValues(numbers);

        int[] numbers1 = { 1, 10, 20, 40, 8, 2, 14 };
        int key = 5;
        int ans = linearSearch(numbers1, key);
        System.out.println(ans);

        int[] numbers2 = { 1, 10, 15, 20, 4 };
        System.out.println(findLargest(numbers2));

        int[] numbers3 = { 10, 2, 15, 70, 6 };
        System.out.println(findSmallest(numbers3));

        String[] menus = { "Idli", "Dosa", "Samosa", "Rasgulla", "Chamcham" };
        String key2 = "Rasgulla";
        System.out.println(linearSearch2(menus, key2));

        int[] numbers4 = { 10, 20, 4, 56, 7 };
        int key3 = 56;
        System.out.println(binarySearch(numbers4, key3));

        int[] numbers5 = { 10, 2, 50, 60, 30 };
        reverse(numbers5);

        int[] numbers6 = { 2, 4, 6, 8, 10 };
        pairsInArray(numbers6);

        int[] numbers7 = { 2, 4, 6, 8, 10 };
        subArray(numbers7);

    }
}
