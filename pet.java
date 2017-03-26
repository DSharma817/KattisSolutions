import java.util.Scanner;
public class pet {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int existingScore = 0, row = 0;
        for (int rowNum = 1; rowNum <= 5; rowNum++) {
            int score = 0;
            for (int scoreCount = 1; scoreCount <= 4; scoreCount++) {
                score += input.nextInt();
                if (score > existingScore) {
                    row = rowNum;
                    existingScore = score;
                }
            }
        }
        System.out.println(row + " " + existingScore);
        input.close();
    }
}
