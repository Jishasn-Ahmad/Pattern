public class PS7 {
    public static void main(String[] args) {
        
        // reverse of number pattern

        int n=5;

        //outter loop
        for(int i=1; i<=n; i++){
            //inner loop
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
