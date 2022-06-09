//Program for greatest number using array
public class array3 {
    public static void main(String[] args) {
        int[] rik = { 1, 5, 10, 19, 99, 33, 34, 67, 69 };
        int max = rik[0];
        for (int i = 1; i < rik.length; i++) {
            if (rik[i] > max)
                max = rik[i];
        }
        System.out.println("tHE gREATEST NUMBER is " + max);

    }
}
