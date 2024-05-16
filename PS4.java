public class PS4 {
    public static void main(String[] args) {
        // inverse half pyramid

        int n =4;

        // outter loop
        for(int i=n; i>=1; i--){
            //inner loop
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
