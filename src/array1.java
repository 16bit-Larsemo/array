//Sum with array
import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        Scanner rik = new Scanner(System.in);
        int sum = 0;
        int[] n = new int[5];
        for (int i = 0; i < n.length; i++)
            n[i] = rik.nextInt();
        for (int j = 0; j < n.length; j++)
            sum = sum + n[j];
        System.out.println("The sum is: " + sum);
    }
}
