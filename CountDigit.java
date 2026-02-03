import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = scanner.nextInt();

        System.out.print("Enter the digit to count: ");
        int digit = scanner.nextInt();

        int count = 0;

        
        if (n == 0 && digit == 0) {
            count = 1;
        } else {
            while (n > 0) {
                int rem = n % 10;
                if (rem == digit) {
                    count++;
                }
                n = n / 10;
            }
        }

        System.out.println("Count = " + count);
        scanner.close();
    }
}
