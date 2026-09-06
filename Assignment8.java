public class Assignment8 {

    //example 1 bubble sort algorithm
    public static void bubbleSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    //example 2 selection sort algorithm
    public static void selectionSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            int maxPos = i;
            for(int j= i+1; j<arr.length; j++){
                if(arr[maxPos] < arr[j]){
                    maxPos = j;
                }
            }
            //swap
            int temp = arr[maxPos];
            arr[maxPos] = arr[i];
            arr[i] = temp;
        }
    }

    //example 3 insertion sort algorithm
    public static  void insertionSort(int[] arr){
        for(int i=1; i<arr.length; i++){
            int temp = arr[i];
            int prev = i-1;
            while(prev >= 0 && arr[prev] < temp){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = temp;
        }
    }

    //example 4 countingSort algorithm
    public static void countingSort(int[] arr){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest , arr[i]);
        }

        int[] count = new int[largest+1];

        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        int j=0;
        for(int i=count.length-1; i>0; i--){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }


    public  static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {3,6,2,1,8,7,4,5,3,1};
        countingSort(arr);
        printArray(arr);
    }
}
