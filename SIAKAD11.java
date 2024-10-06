import java.util.Scanner;

public class SIAKAD11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan nama: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        String nim = sc.nextLine();
        System.out.print("Masukkan kelas: ");
        String kelas = sc.nextLine();
        System.out.print("Masukkan nomor absen: ");
        int absen = sc.nextInt();
        System.out.print("Masukkan nilai kuis: ");
        double nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        double nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai ujian: ");
        double nilaiUjian = sc.nextDouble();

        double nilaiAkhir = (nilaiKuis * 0.2) + (nilaiTugas * 0.3) + (nilaiUjian * 0.5);

        String nilaiHuruf;
        String kualifikasi;

        if (nilaiAkhir >= 81 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
            kualifikasi = "Sangat Baik";
        } else if (nilaiAkhir >= 74 && nilaiAkhir < 80) {
            nilaiHuruf = "B+";
            kualifikasi = "Lebih dari Baik";
        } else if (nilaiAkhir >= 66 && nilaiAkhir < 73) {
            nilaiHuruf = "B";
            kualifikasi = "Baik";
        } else if (nilaiAkhir >= 61 && nilaiAkhir < 65) {
            nilaiHuruf = "C+";
            kualifikasi = "Lebih dari Cukup";
        } else if (nilaiAkhir >= 51 && nilaiAkhir < 60) {
            nilaiHuruf = "C";
            kualifikasi = "Cukup";
        } else if (nilaiAkhir >= 40 && nilaiAkhir < 50) {
            nilaiHuruf = "D";
            kualifikasi = "Kurang";
        } else {
            nilaiHuruf = "E";
            kualifikasi = "Gagal";
        }

        System.out.println("\nMahasiswa dengan nama " + nama + " (NIM " + nim + ") kelas " + kelas + " nomor absen " + absen);
        System.out.printf("Nilai akhir: %.2f\n", nilaiAkhir);
        System.out.println("Nilai akhir huruf: " + nilaiHuruf);
        System.out.println("Kualifikasi: " + kualifikasi);

        sc.close();
    }
}
