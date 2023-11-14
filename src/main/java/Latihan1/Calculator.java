package Latihan1;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=== Calculator ===");
            System.out.println("1. Akar Kuadrat");
            System.out.println("2. Pangkat");
            System.out.println("3. Logaritma");
            System.out.println("4. Faktorial");
            System.out.println("5. Keluar");
            System.out.print("Pilih operasi (1/2/3/4/5): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    akarKuadrat();
                    break;
                case 2:
                    pangkat();
                    break;
                case 3:
                    logaritma();
                    break;
                case 4:
                    faktorial();
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

    private static void akarKuadrat() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        double angka = scanner.nextDouble();

        if (angka < 0) {
            System.out.println("Angka harus non-negatif untuk akar kuadrat.");
        } else {
            double hasil = Math.sqrt(angka);
            System.out.println("Hasil akar kuadrat dari " + angka + " adalah " + hasil);
        }
    }

    private static void pangkat() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        double angka = scanner.nextDouble();
        System.out.print("Masukkan pangkat: ");
        double pangkat = scanner.nextDouble();

        double hasil = Math.pow(angka, pangkat);
        System.out.println("Hasil " + angka + " pangkat " + pangkat + " adalah " + hasil);
    }

    private static void logaritma() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        double angka = scanner.nextDouble();

        double hasil = Math.log10(angka);
        System.out.println("Hasil logaritma basis 10 dari " + angka + " adalah " + hasil);
    }

    private static void faktorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = scanner.nextInt();

        int hasil = 1;
        for (int i = 1; i <= angka; i++) {
            hasil *= i;
        }
        System.out.println("Hasil faktorial dari " + angka + " adalah " + hasil);
    }
}
