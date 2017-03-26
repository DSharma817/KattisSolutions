import java.util.Scanner;
public class ColdputerScience {
    public static void main(String[] args) {
        Scanner input =  new Scanner (System.in);
        int N = input.nextInt();
        int sum = 0;
        for (int count = 1; count <= N; count++) {
            int nums = input.nextInt();
            if (nums < 0) {
                sum++;
            }
        }
        System.out.println(sum);
        input.close();
    }
}
