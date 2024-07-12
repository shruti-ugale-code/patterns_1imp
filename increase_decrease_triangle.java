public class increase_decrease_triangle {
    public static void main(String[] args) {
        square(8);

    }
    public static void square(int n){
        for (int i = 0; i <n ; i++) {

            for (int j = 0; j <i ; j++) {
                System.out.print("❤ ");

            }
            System.out.println(" ");

        }
        for (int i = n; i >0 ; i--) {

            for (int j = 0; j <i; j++) {
                System.out.print("❤ ");

            }
            System.out.println(" ");

        }
    }
}
