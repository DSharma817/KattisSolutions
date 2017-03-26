/* 
 * @author Dheeraj Sharma
 * @version 1.0
 */
 
import java.util.Scanner;
public class stuck_In_a_Time_Loop {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int N = input.nextInt();
        for (int i = 1; i <= N; i++) {
            System.out.println(i + " Abracadabra");
        }
        input.close();
    }
}
