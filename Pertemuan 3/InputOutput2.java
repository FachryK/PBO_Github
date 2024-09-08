import java.util.Scanner;

public class InputOutput2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = new String[3];
        int[] num = new int[3];

        for (int i = 0; i < 3; i++) { 
            str[i] = scanner.next();
            num[i] = scanner.nextInt();

        }
        System.out.println("================================");

        for (int i = 0; i < 3; i++) {
            System.out.printf("%-15s%03d%n", str[i], num[i]);
        }

        System.out.println("================================");

        scanner.close();
    }
}
