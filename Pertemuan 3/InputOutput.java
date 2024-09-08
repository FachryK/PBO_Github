import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = in.nextLine();

        String regex = "[ ,!,?,,,.,_,',@]";

        String[] parts = input.split(regex);

        int count = parts.length;

        System.out.println("Number of splits: " + count);
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
