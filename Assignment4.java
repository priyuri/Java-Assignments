public class Assignment4 {
    public static void main(String[] args) {
        //inverted pattern
        int n=4;
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //example 2 hollow rectangle pattern
        int m=5;
        for(int i=1; i<=m; i++){
            for(int j=1; j<=m; j++){
                if(i==1 || j==1 || i==m || j==m){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //example 3 inverted and rotated half pyramid pattern
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}