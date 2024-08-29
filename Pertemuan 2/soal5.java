import java.util.Scanner;
public class soal5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String A;
        String B = "java";
        System.out.print("Enter Hello = ");
        A = scan.nextLine();
        System.out.print("Enter Java = ");
        B = scan.nextLine();
        // No 1
        int sum = A.length() + B.length();
        System.out.println(sum);

        // No 2
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // No 3
        String capitalizedA = A.replaceFirst(".", A.substring(0, 1).toUpperCase());
        String capitalizedB = B.replaceFirst(".", B.substring(0, 1).toUpperCase());
        System.out.println(capitalizedA + " " + capitalizedB);
    }
}