public class Pentle {
    public static void main(String[] args) {
        double a = 0.00;
        while (a < 3.10) {
            System.out.printf("%.1f\n", a);
            a = a + 0.10;

        }
        System.out.println("\n");

        a = 0.00;


        do {
            System.out.printf("%.1f\n", a);
            a = a + 0.1;


        } while (a < 3.1);

    }
}
