import java.util.Scanner;

public class BetaTesting2 {
    public static void main(String[] args) {
        int number = 10;
        double number2pointo = number;
        System.out.println(number + number2pointo);

        /**
         * Decision
         */

        /**
         * else if
         */

        /**
         * switch case
         */

        /**
         * nested else
         */

        /**
         * if
         */

        /**
         * ternary
         */
        boolean isMember = true;
        int totalbeli = 12_000;

        if (totalbeli > 10_000){
            System.out.println("Anda dapat diskon");
            double diskon = 0.1;
            int totalbelibeneran = (int) (totalbeli * diskon);
            System.out.println("Total diskon: " + totalbelibeneran);
            System.out.println(totalbeli - totalbelibeneran);
        } else if (totalbeli<10000) {
            System.out.println("Maaf Kena Prank");
        }

        // System.out.println("Login");
        Scanner sc = new Scanner(System.in);
        String pw = "cahyo";
        String user = "cahyo123";
        System.out.print("Masukkan Username  : ");
        String inputUser = sc.nextLine();
        System.out.print("Masukkan Pw : ");
        String inputPw = sc.nextLine();
        if (user .equals(inputUser)) {
            if (pw .equals(inputPw)) {
                System.out.println("Selamat anda berhasil bro");
            } else {
                System.out.println("Maaf pw salah");
            }
        } else{
            System.out.println("Maaf user salah");
        }

    }
}
