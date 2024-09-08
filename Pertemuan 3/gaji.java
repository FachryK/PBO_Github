import java.util.Scanner;

public class gaji {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Masukkan jumlah penjualan: ");
        int jumlahPenjualan = in.nextInt();

        int gajiPokok = 500000;
        int hargaItem = 50000;
        double gajiTotal;

        if (jumlahPenjualan > 80) {
            gajiTotal = gajiPokok + (0.35 * hargaItem * jumlahPenjualan);
        }
        else if (jumlahPenjualan >= 40) {
            gajiTotal = gajiPokok + (0.25 * hargaItem * jumlahPenjualan);
        }
        else if (jumlahPenjualan < 15) {
            double denda = 0.15 * (hargaItem * (15 - jumlahPenjualan));
            gajiTotal = gajiPokok - denda;
        }
        else {
            gajiTotal = gajiPokok + (0.1 * hargaItem * jumlahPenjualan);
        }

        System.out.println("Gaji Total: Rp" + gajiTotal);
    }
}
