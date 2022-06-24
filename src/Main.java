import java.util.Scanner;

public class Main {

    public static void example() {
        int[] number = new int[3];

        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        int size = 3;

        int j = 0;
        int total = 0;
        int k = 0;

        while(j < size) {
            k = j;
            while (k < size) {
                total += number[k];
                k++;
            }
            j++;
        }
        System.out.println(total);
    }

    public static void main(String[] args) {

    }
}
