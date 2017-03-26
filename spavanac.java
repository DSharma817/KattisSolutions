import java.util.Scanner;
public class Spavanac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hoursGiven = input.nextInt();
        int minutesGiven = input.nextInt();
        if (hoursGiven == 0) {
            hoursGiven = 24;
        }
        int minutes = (hoursGiven * 60) + minutesGiven;
        minutes = minutes - 45;
        int newHours = minutes / 60;
        int newMinutes = minutes % 60;
        if (newHours == 24){
            newHours =0;
        }
        System.out.println(newHours + " " + newMinutes);
        input.close();
    }
}
