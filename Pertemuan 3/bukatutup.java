import java.util.Scanner;

public class bukatutup {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan Plat Nomor: ");
        String plat = in.nextLine();
        String regex = "[ ]";
        String angka = plat.replace(" ", "");
        long angkaGabungan = Long.parseLong(angka);
        angkaGabungan = angkaGabungan - 999999;
        if (angkaGabungan % 5 != 0) {
            System.out.println("Berhenti");
        }
        else{
            System.out.println("Jalan");
        }
    }
}
