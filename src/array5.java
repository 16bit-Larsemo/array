//Linear Search using array
public class array5 {
    public static void main(String[] args) {
        int[] n = { 1, 2, 3, 4, 5, 6, 7, 11, 15, 14, 13, 12 };
        int repvalue = 13;
        int pos = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] == repvalue)
                pos = i;
        }
        if (pos == 0)
            System.out.println("Sasur ka nati tu scammer hain");
        else
            System.out.println("The position of the key " + (pos + 1));
    }
}
