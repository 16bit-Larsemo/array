
//Bubble sort(ascending order)
public class array12 {
    public static void main(String[] args) {
        int n[] = { 7, 8, 3, 1, 2 };
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i - 1; j++) {
                if (n[j] > n[j + 1]) {
                    // swap
                    int temp = n[j];
                    n[j] = n[j + 1];
                    n[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < 5; i++)
            System.out.print(n[i] + " ");
    }
}
