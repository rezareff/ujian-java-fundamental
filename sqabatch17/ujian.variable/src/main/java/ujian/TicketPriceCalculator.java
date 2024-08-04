package ujian;

import java.util.Scanner;

public class TicketPriceCalculator {

    public static void main(String[] args) {
        // Harga tiket
        final int HARGA_WEEKDAY = 35000;
        final int HARGA_WEEKEND = 45000;

        // Membuat Scanner untuk membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan jumlah tiket
        System.out.print("Masukkan jumlah tiket: ");
        int jumlahTiket = scanner.nextInt();

        // Meminta pengguna memilih jenis hari (weekday atau weekend)
        System.out.print("Apakah tiket untuk weekday atau weekend? (masukkan 'weekday' atau 'weekend'): ");
        String jenisHari = scanner.next();

        // Menentukan harga per tiket berdasarkan jenis hari
        int hargaPerTiket;
        if (jenisHari.equalsIgnoreCase("weekday")) {
            hargaPerTiket = HARGA_WEEKDAY;
        } else if (jenisHari.equalsIgnoreCase("weekend")) {
            hargaPerTiket = HARGA_WEEKEND;
        } else {
            System.out.println("Jenis hari tidak valid. Menggunakan harga weekday secara default.");
            hargaPerTiket = HARGA_WEEKDAY;
        }

        // Menghitung total harga sebelum diskon
        int totalHarga = jumlahTiket * hargaPerTiket;

        // Menghitung diskon jika jumlah tiket lebih dari 5
        if (jumlahTiket > 5) {
            totalHarga = (int) (totalHarga * 0.9); // Diskon 10%
        }

        // Mencetak total harga
        System.out.println("Total harga (dengan diskon jika berlaku): " + totalHarga);

        // Menutup Scanner
        scanner.close();
    }
}
