import java.util.Scanner;

public class WeeklySales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of salespeople: ");
        int numSalespeople = scanner.nextInt();
        scanner.nextLine();
        
        Salesperson[] salesStaff = new Salesperson[numSalespeople];
        
        for (int i = 0; i < numSalespeople; i++) {
            System.out.println("\nEnter details for Salesperson " + (i + 1) + ":");
            System.out.print("First Name: ");
            String firstName = scanner.nextLine();
            
            System.out.print("Last Name: ");
            String lastName = scanner.nextLine();
            
            System.out.print("Sales Amount: ");
            int salesAmount = scanner.nextInt();
            scanner.nextLine();
            
            salesStaff[i] = new Salesperson(firstName, lastName, salesAmount);
        }
        
        Sorting.insertionSort(salesStaff);
        
        System.out.println("\nRanking of sales for the Week\n");
        for (Salesperson s : salesStaff) {
            System.out.println(s);
        }

        scanner.close();
    }
}