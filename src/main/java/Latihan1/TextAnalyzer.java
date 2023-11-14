package Latihan1;
import java.util.Scanner;
public class TextAnalyzer {
    private static String teks = "";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=== MENU TEKS ANALYZER ===");
            System.out.println("1. Masukkan Teks");
            System.out.println("2. Hitung Jumlah Karakter");
            System.out.println("3. Hitung Jumlah Kata");
            System.out.println("4. Cari Kata dalam Teks");
            System.out.println("5. Keluar");
            System.out.print("Pilihan Anda: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    masukkanTeks(scanner);
                    break;
                case 2:
                    hitungJumlahKarakter();
                    break;
                case 3:
                    hitungJumlahKata();
                    break;
                case 4:
                    cariKata(scanner);
                    break;
                case 5:
                    System.out.println("Terima kasih! Keluar dari program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
            }
        }
    }

    private static void masukkanTeks(Scanner scanner) {
        System.out.print("Masukkan teks: ");
        scanner.nextLine(); // membersihkan buffer
        teks = scanner.nextLine();
        System.out.println("Teks telah dimasukkan!\n");
    }

    private static void hitungJumlahKarakter() {
        System.out.println("Jumlah karakter dalam teks: " + teks.length() + "\n");
    }

    private static void hitungJumlahKata() {
        String[] kataArray = teks.split("\\s+");
        System.out.println("Jumlah kata dalam teks: " + kataArray.length + "\n");
    }

    private static void cariKata(Scanner scanner) {
        System.out.print("Masukkan kata yang ingin dicari: ");
        String kataCari = scanner.next();
        boolean kataDitemukan = teks.contains(kataCari);

        if (kataDitemukan) {
            System.out.println("Kata '" + kataCari + "' ditemukan dalam teks.\n");
        } else {
            System.out.println("Kata '" + kataCari + "' tidak ditemukan dalam teks.\n");
        }
    }
}
