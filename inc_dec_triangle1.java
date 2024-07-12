public class inc_dec_triangle1 {
    public static void main(String[] args) {
        square(8);

    }
    public static void square(int n) {
        for (int row = 0; row < n*2; row++) {
            int colsearch=row>n?2*n-row:row;

            for (int col = 0; col < colsearch; col++) {
                System.out.print("❤ ");

            }
            System.out.println(" ");

        }
    }
}
