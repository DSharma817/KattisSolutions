import java.util.Scanner;
public class TwoStones {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int nums = input.nextInt();
        boolean result = false;
        if (nums % 2 == 1) {
            System.out.println("Alice");
        } else {
            System.out.println("Bob");
        }
    }
}
