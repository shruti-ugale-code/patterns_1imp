public class no_diamond {

        public static void main(String[] args) {
            pryamid(5);



        }
        public static void pryamid(int n){
            for (int row = 1; row <=2*n; row++) {
                int c=row>n?2*n-row:row;

                for (int i = 1; i <=n-c ; i++) {
                    System.out.print("  ");

                }
                for (int col = c; col >=1 ; col--) {
                    System.out.print (col+" ");


                }
                for (int col = 2; col <=c; col++) {
                    System.out.print(col+" ");

                }
                System.out.println( );
            }



        }
    }


