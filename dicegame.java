import java.util.Scanner;
public class DiceGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Gunnar = 0;
        for (int x = 0; x < 4; x++) {
            int roll = input.nextInt();
            Gunnar += roll;
        }
        int Emma = 0;
        for (int x = 0; x < 4; x++) {
            int roll = input.nextInt();
            Emma += roll;
        }
        if (Emma > Gunnar){
            System.out.println("Emma");
        } else if (Emma < Gunnar) {
            System.out.println("Gunnar");
        } else if (Emma == Gunnar) {
            System.out.println("Tie");
        }
        input.close();
    }
}
