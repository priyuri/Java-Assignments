public class strRemoveDuplicate {
    public static  void removeduplicate(String str , int idx , StringBuilder newStr , boolean[] map){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true){
            //duplicate char available in map array
            removeduplicate(str, idx+1, newStr, map);
        }else{
            map[currChar - 'a'] = true;
            removeduplicate(str, idx+1, newStr.append(currChar), map);
        }

    }
    public static void main(String[] args) {
        String str = "appnnacollege";
        removeduplicate(str, 0, new StringBuilder(" "), new boolean[26]);
    }
}
