import java.util.Scanner;

public class Fibo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();   

        int a = 0, b = 1;

        if (n >= 0) {
            System.out.print(a + " ");
        }
        if (n >= 1) {
            System.out.print(b + " ");
        }

        for (int i = 2; i <= n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

        scanner.close();
    }
}
