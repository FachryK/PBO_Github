import java.util.Scanner;

public class soal1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t;

        for (int i = 1; i <= 6; i++) {
            System.out.print("Masukkan Angka = ");
            t = sc.nextLine();
            try {
                long n = Long.parseLong(t);

                if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
                    System.out.println(n + " can be fitted in: \n byte\n short\n int\n long");
                } else if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
                    System.out.println(n + " can be fitted in: \n short\n int\n long");
                } else if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
                    System.out.println(n + " can be fitted in: \n int\n long");
                } else if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE) {
                    System.out.println(n + " can be fitted in: \n long");
                }
            } catch (Exception e) {
                System.out.println(" can't be fitted anywhere.");
            }
        }
        sc.close();
    }
}
