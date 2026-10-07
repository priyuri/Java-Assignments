import java.util.*;
public class demo {
    public static int binarySearch(int[] arr , int target){
        int si = 0;
        int ei = arr.length-1;
        while(si <= ei){
            int mid = si + (ei-si) / 2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] < target){
                si = mid+1;
            }else{
                ei = mid-1;
            }
        }
        return -1;


    }

    public static void main(String args[]) {
        int[] arr = {2,4,8,17,20};
        int target =1;
        int Idx = binarySearch(arr, target);
        System.out.println(Idx);


    }
}
