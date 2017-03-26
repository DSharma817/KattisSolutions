import java.util.Scanner;
public class ladder {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int height;
        double angle;
        height = input.nextInt();
        angle = input.nextInt();
        angle = Math.toRadians(angle);
        int ladderLength;
        ladderLength = (int) Math.ceil(height / Math.sin(angle));
        System.out.println(ladderLength);
        input.close();
    }
}
