public class RotatedArray {
    public static int search(int[] arr , int target , int si , int ei){
        if(si > ei){
            return -1;
        }
        //find median
        int mid = si+(ei-si)/2;

        //found index
        if(arr[mid] == target){
            return mid;
        }

        //mid on left line
        if(arr[si] <= arr[mid]){
            //case 1 
            if(arr[si] <= target && target <= arr[mid]){
                return search(arr, target, si, mid-1);
            }else{
                //case 2
                return search(arr, target, mid+1 , ei);
            }
        }else{
            //case 3
            if(arr[mid]<=target && target <= arr[ei]){
                return search(arr, target, mid+1, ei);
            }else{
                return search(arr, target, si, mid-1);
            }
        }

    }
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 5;
        int tarIdx = search(arr, target, 0, arr.length-1);
        System.out.println(tarIdx);

    }
}
