import java.util.Scanner;

public class ProjectSuniclo {
    public static void main(String[] args) {
        // Barang dan Harga
    String PurchasedItem = "Purchased Item";
    String itemPurchased1 = "1.MenOversizeTshirtBlackL";
    String itemPurchased2 = "2.AirismiPolkadotKidsSock";
    String itemPurchased3 = "3.UnisexCasualCapCream";
    String itemPurchased4 = "4.UnisexWindbreakerJacketPurpleL";
    String itemPurchased5 = "5.MenHeatechyJoggerPantsL";
    String itemPurchased6 = "6.WomenCasualBlazerNavyM";
    String itemPurchased7 = "7.WomenRippedJeansCasualCutNavyM";

    double MenOversizeTshirtBlackL = 300000;
    double AirismiPolkadotKidsSock = 150000;
    double UnisexCasualCapCream = 200000;
    double UnisexWindbreakerJacketPurpleL = 350000;
    double MenHeatechyJoggerPantsL = 500000;
    double WomenCasualBlazerNavyM = 800000;
    double WomenRippedJeansCasualCutNavyM = 1200000;
        // Total beli
    double totalPurchase = MenOversizeTshirtBlackL + AirismiPolkadotKidsSock + UnisexCasualCapCream + UnisexWindbreakerJacketPurpleL + MenHeatechyJoggerPantsL + WomenCasualBlazerNavyM + WomenRippedJeansCasualCutNavyM;
        // Diskon
    double Discount = 0;
    
    if (totalPurchase > 1_000_000) {
        Discount = 17.5;
    } else if (totalPurchase > 750_000) {
        Discount = 15;
    } else if (totalPurchase > 500_000) {
        Discount = 10;
    } else if (totalPurchase > 200_000) {
        Discount = 5;
    } else {
        Discount = 0;
    }
    double discountAmount = totalPurchase * (Discount / 100);
        double finalPrice = totalPurchase - discountAmount;
        //Hasil
        System.out.println(PurchasedItem);
        System.out.println("--------------------------------");
        System.out.println(itemPurchased1);
        System.out.println(itemPurchased2);
        System.out.println(itemPurchased3);
        System.out.println(itemPurchased4);
        System.out.println(itemPurchased5);
        System.out.println(itemPurchased6);
        System.out.println(itemPurchased7);
        System.out.println("-----------------------------");
        System.out.println("Total Purchase: IDR " + totalPurchase);
        System.out.println("Discount: " + Discount + "%");
        System.out.println("Discount Amount: IDR " + discountAmount);
        System.out.println("Final Price (After Discount): IDR " + finalPrice);
        System.out.println("----------------------- Tugas 1 Done");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Temperature of Fahrenheit ya: ");
        double Fahrenheit = scanner.nextDouble();
        double Kelvin = (Fahrenheit-32) * 5 / 9 + 273.15;
        System.out.println("Result Temperature in Kelvin: " + Kelvin);
    }
}
