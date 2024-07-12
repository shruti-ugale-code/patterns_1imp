public class triangle_pattern {
    public static void main(String[] args) {
        square(8);

    }
    public static void square(int n){
        for (int i = 0; i <n ; i++) {
            System.out.println(" ");
            for (int j = 0; j <i ; j++) {
                System.out.print("❤ ");

            }

        }
    }
}
