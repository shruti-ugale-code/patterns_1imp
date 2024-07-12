public class diamond_pattern {
    public static void main(String[] args) {
        square(5);

    }
    public static void square(int n) {
        for (int row = 0; row < n*2; row++) {


            int colsearch=row>n?2*n-row:row;

            int nospeces=n-colsearch;
            for (int i = 0; i <nospeces ; i++) {
                System.out.print(" ");

            }

            for (int col = 0; col < colsearch; col++) {
                System.out.print("❤ ");

            }
            System.out.println(" ");

        }
    }
}
