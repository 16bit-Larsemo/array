import java.util.Scanner;

public class DoubleDimensionalArray {
    public static void main(String[] args) {
        Scanner rik =new Scanner(System.in);
        char m[][]={{'a','b','c','d'},{'e','f','g','h'},{'i','j','k','l'}};
        System.out.println("The elements of this DDA are:");
        for (int i = 0; i < 3; i++) {
            for(int j=0;j<4;j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }
}
