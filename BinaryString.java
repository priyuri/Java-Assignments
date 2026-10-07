public class BinaryString {
    //binary string without consecutive ones 11 = not valid
    public static void getBinaryStr(int n , int lastplace , String str){
        if(n == 0){
            System.out.println(str);
            return;
        }
        getBinaryStr(n-1, 0, str+"0");
        if(lastplace == 0){
            getBinaryStr(n-1, 1, str+"1");
        }

    }
    //binary string without consecutive zeros 00 = not valid
    public static void getBinaryStr2(int n , int lastplace , String str){
        if(n == 0){
            System.out.println(str);
            return;
        }
        getBinaryStr2(n-1, 1, str+"1");
        if(lastplace == 1){
            getBinaryStr2(n-1, 0, str+"0");
        }
    }
    public static void main(String[] args) {
        // getBinaryStr(3, 0, " ");  
        getBinaryStr2(3, 1, " ");      
    }
}
