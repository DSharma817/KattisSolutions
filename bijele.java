import java.util.Scanner;
public class bijele {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int array [] = {1,1,2,2,2,8};
        for (int i = 1; i < array.length + 1; i++) {
            int array2 [] = new int[6];
            array2[i-1] = input.nextInt();
            int diff = array[i - 1] - array2[i - 1];
            System.out.print(diff + " ");
        }
    }
}
