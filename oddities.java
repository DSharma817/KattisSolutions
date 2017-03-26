import java.util.Scanner;
public class Oddities {
    public static void main(String[] args) {
        Scanner input =  new Scanner (System.in);
        int N = input.nextInt();
        for (int count = 1; count <= N; count++) {
            int nums = input.nextInt();
            if (nums % 2 == 0) {
                System.out.println(nums + " is even");
            } else {
                System.out.println(nums + " is odd");
            }
        }
        input.close();
    }
}
