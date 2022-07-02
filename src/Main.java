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

    public static void inputOutput() {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();
        // Write your code here.


        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }

    public static void main(String[] args) {

    }
}
