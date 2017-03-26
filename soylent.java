import java.util.Scanner;
public class soylent {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        long x = input.nextInt();
        for (long i = 0; i < x; i++) {
            long num = input.nextInt();
            if (num % 400 == 0) {
                System.out.println(num / 400);
            }
            else {
                System.out.println( (num / 400) + 1);
            }
        }
        input.close();
    }
}
