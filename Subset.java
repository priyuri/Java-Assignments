public class Subset {
    public static  void subset(String s , int i , String newStr) {
        // Code here
        //base case
        if(i == s.length()){
            if(newStr.length() == 0){
                System.out.println("null");
                return;
            }else{
                System.out.println(newStr);
                return;
            }
        }

        //yes
        subset(s, i+1, newStr+s.charAt(i));
        //no
        subset(s, i+1, newStr);


    }
    

    public static void main(String[] args) {
        String s = "abc";
        subset(s, 0, "");
        

    }

}


