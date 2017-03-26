import java.util.Scanner;
public class aRealChalllllenge {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        long area = input.nextLong();
        double side = Math.sqrt(area);
        double perimeter = 4 * side; 
        System.out.println(perimeter);
        input.close();
    }
}
