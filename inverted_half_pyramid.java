public class inverted_half_pyramid {
    public static void main(String[] args) {
        int a=4;
        for (int i = a; i >= 1; i--) {
            for (int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
