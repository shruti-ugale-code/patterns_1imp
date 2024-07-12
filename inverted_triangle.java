public class inverted_triangle {
    public static void main(String[] args) {
        square(5);

    }
    public static void square(int n){
        for (int i = n; i >0 ; i--) {

            for (int j = 0; j <i; j++) {
                System.out.print("❤ ");

            }
            System.out.println(" ");

        }
    }
}
