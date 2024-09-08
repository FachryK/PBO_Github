import java.util.*;

public class berhitung {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan A, operator, dan B (dipisahkan dengan spasi): ");
        String barisInput = in.nextLine();
        String[] array = barisInput.split(" ");

        int A = Integer.parseInt(array[0]);
        if (A < 1) {
            System.out.println("A tidak boleh kurang dari 1!");
            System.exit(0);
        }
        String operator = array[1];
        int B = Integer.parseInt(array[2]);
        if (B > 1000) {
            System.out.println("B tidak boleh lebih dari 1000!");
            System.exit(0);
        }

        int result = 0;
        switch (operator) {
            case "+":
                result = A + B;
                System.out.println("Hasil: " + result);
                break;
            case "-":
                result = A - B;
                System.out.println("Hasil: " + result);
                break;
            case "*":
                result = A * B;
                System.out.println("Hasil: " + result);
                break;
            case "/":
                if (B != 0) {
                    if (A % B != 0) {
                        System.out.println("A harus habis dibagi B!");
                        break;
                    }
                    result = A / B;
                    System.out.println("Hasil: " + result);
                } else {
                    System.out.println("B tidak boleh 0!");
                    return;
                }
                break;
            case "%":
                if (B != 0) {
                    result = A % B;
                    System.out.println("Hasil: " + result);
                } else {
                    System.out.println("B tidak boleh 0!");
                    return;
                }
                break;
            default:
                System.out.println("Operator apa itu!");
                return;
        }
    }
}
