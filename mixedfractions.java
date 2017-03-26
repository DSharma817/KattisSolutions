import java.util.Scanner;
public class mixedFractions {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        boolean condition = true;
        while (input.hasNextInt() && condition == true) {
            long num1 = input.nextInt();
            long num2 = input.nextInt();
            if (num1 == 0 && num2 == 0) {
                condition = false;
            } else {
                long wholeNum = num1 / num2;
                long remainder = num1 % num2;
                System.out.println(wholeNum + " " + remainder + " / " + num2);
            }
        }
    }
}
