import java.util.*;

public class Assignment15 {
    public static void revArrayList(ArrayList<Integer> list) {
        int i = 0;
        int j = list.size() - 1;
        while (i < j) {
            int temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }
        System.out.println(list);
    }

    public static int findMaximum(ArrayList<Integer> list) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            // if(max < list.get(i)){
            // max = list.get(i);
            // }
            max = Math.max(max, list.get(i));
        }
        return max;
    }

    public static void swapNumber(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
        System.out.println(list);
    }

    // container with most water  O^2
    // public static int mostWater(ArrayList<Integer> list) {
    //     int maxWater = 0;
    //     for (int i = 0; i < list.size(); i++) {
    //         for (int j = i + 1; j < list.size(); j++) {
    //             int width = j - i;
    //             int height = Math.min(list.get(i), list.get(j));
    //             int currWater = width * height;
    //             maxWater = Math.max(maxWater, currWater);
    //         }
    //     }
    //     return maxWater;

    // }

    public static int mostWater(ArrayList<Integer> list){
        int maxWater = 0;
        int left = 0;
        int right = list.size()-1;
        while(left < right){
            int width = right - left;
            int height = Math.min(list.get(left) , list.get(right));
            int currWater = width * height;
            maxWater = Math.max(maxWater , currWater);
            //update pointers
            if(list.get(left) < list.get(right)){
                left++;
            }else{
                right--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.println(mostWater(list));

        // built in sort
        // Collections.sort(list , Collections.reverseOrder());
        // System.out.println(list);
        // revArrayList(list);
        // System.out.println(findMaximum(list));
        // swapNumber(list, 1, 3);

        // multidimensional arraylist
        // ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        // ArrayList<Integer> list1 = new ArrayList<>();
        // ArrayList<Integer> list2 = new ArrayList<>();
        // ArrayList<Integer> list3 = new ArrayList<>();
        // for(int i=1; i<=5; i++){
        // list1.add(i*1);
        // list2.add(i*2);
        // list3.add(i*3);
        // }
        // mainList.add(list1);
        // mainList.add(list2);
        // mainList.add(list3);
        // //print
        // for(int i=0; i<mainList.size(); i++){
        // ArrayList<Integer>currList = mainList.get(i);
        // for(int j=0; j<currList.size(); j++){
        // System.out.print(currList.get(j)+" ");
        // }
        // System.out.println();
        // }

    }
}
