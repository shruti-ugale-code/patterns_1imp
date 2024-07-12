public class numerical_square {
    public static void main(String[] args) {
        square(4);


    }
    public static void square(int n){
        n=2*n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <=n ; col++) {
                int formula=Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(formula+" ");

            }
            System.out.println( );


        }
    }
}
