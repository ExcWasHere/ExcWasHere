import java.util.Scanner;

public class BetaTesting {
    public static void main(String[] args) {
        int x = 10;
        x += 3;
        int y = 22;
        y -= 5;
        int z = 15;
        z *= 2;
        int e = 30;
        e /= 5;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(e);
        @SuppressWarnings("resource")
        Scanner cahyo = new Scanner(System.in);
        System.out.print("Nama : ");
        cahyo.nextLine();
        System.out.print("NIM : ");
        cahyo.nextLine();
        System.out.print("Kelas : ");
        cahyo.nextLine();
        System.out.print("Prodi : ");
        cahyo.nextLine();
    }
}
