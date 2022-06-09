//Multiple of 3 of the number divisible by 7
public class array2 {
    public static void main(String[] args) {
        int[] n = { 3, 7, 14, 23, 21, 35, 46, 54, 56, 49 };
        int fine;
        for (int i = 0; i < n.length; i++) {
            if (n[i] % 7 == 0) {
                fine = n[i] * 3;
                System.out.println("The multiple of 3 of " + n[i] + "is " + fine);
            }
        }
    }
}
