import java.math.BigInteger;
import java.util.Scanner;

public class bignumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan Angka Pertama : ");
        String a = in.nextLine();
        System.out.println("Masukkan Angka Kedua : ");
        String b = in.nextLine();

        BigInteger bigA = new BigInteger(a);
        BigInteger bigB = new BigInteger(b);

        BigInteger sum = bigA.add(bigB);
        BigInteger multiple = bigA.multiply(bigB);

        System.out.println("Sum : ");
        System.out.println(sum);
        System.out.println("Multiply : ");
        System.out.println(multiple);
    }
}
