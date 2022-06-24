import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.io.*;

public class IfElse {
    private static final Scanner scanner = new Scanner(System.in);

    public static void ifElse() {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if(N % 2 != 0) {
            System.out.println("Weird");
        } else if (N >= 2 && N <= 5) {
            System.out.println("Not Weird");
        } else if (N >= 6 && N <= 20) {
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }
        scanner.close();
    }
}
