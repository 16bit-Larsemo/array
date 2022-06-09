//Program for smallest number using array
public class array4 {
    public static void main(String[] args) {
        int[] n = { 3, 5, 7, 9, 11, 13, 15, 17, 19 };
        int min = n[0];
        for (int i = 0; i < n.length; i++) {
            if (n[i] < min)
                min = n[i];
        }
        System.out.println("The smallest number is: " + min);
    }
}
