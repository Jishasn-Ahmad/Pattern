public class PS5 {
    public static void main(String[] args) {
        // inverted half pyramid (rotated by 180)

        int n =4;

        //outter loop

        for(int i=1; i<=n; i++){
            //inner loop(space print)

            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //inner loop(start print)
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
