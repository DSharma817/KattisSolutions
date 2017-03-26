import java.util.Scanner;
public class aaaaah {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        String jon = input.nextLine();
        String doc = input.nextLine();
        if (jon.length() >= doc.length()) {
            System.out.println("go");
        } else {
            System.out.println("no");
        }
        input.close();
    }
}
