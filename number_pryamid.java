public class number_pryamid {
    public static void main(String[] args) {
        pryamid(5);



    }
    public static void pryamid(int n){
        for (int row = 1; row <=n; row++) {

            for (int i = 1; i <=n-row ; i++) {
                System.out.print("  ");

            }
            for (int col = row; col >=1 ; col--) {
                System.out.print (col+" ");


            }
            for (int col = 2; col <=row; col++) {
                System.out.print(col+" ");

            }
            System.out.println( );
        }

    }
}
