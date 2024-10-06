import java.util.Scanner;
public class TokoBetaTesting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stok = 100;
        boolean transaksi = true;
        boolean adaTransaksi = true;
        do {
            System.out.print("Apakah ada Transaksi Hari ini? ");
            String transakString = sc.nextLine();
            switch (transakString) {
                case "Y":
                    System.out.println("Berapa Barang yang Terjual?");
                    int barangTerjual = sc.nextInt();
                    if (barangTerjual <= stok){
                        System.out.println();
                    stok -= barangTerjual;
                    System.out.println("Sisa Stok Barang: " + stok);} else {
                        System.out.println("Barang Gak Cukup Ges");
                    }
                    break;
                case "T":
                    break;
                default:
                    break;
            }
        } while (adaTransaksi);
    }
}
