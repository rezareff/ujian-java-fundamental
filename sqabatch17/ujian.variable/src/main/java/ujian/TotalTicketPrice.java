package ujian;

import java.util.Scanner;

public class TotalTicketPrice {

    public static void main(String[] args) {
        // Membuat Scanner untuk membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Membuat array untuk menyimpan harga tiket dari 5 film
        int[] hargaTiket = new int[5];

        // Meminta pengguna memasukkan harga tiket untuk setiap film
        System.out.println("Masukkan harga tiket untuk 5 film:");

        int totalHarga = 0; // Variabel untuk menyimpan total harga tiket

        for (int i = 0; i < hargaTiket.length; i++) {
            System.out.print("Harga tiket film " + (i + 1) + ": ");
            hargaTiket[i] = scanner.nextInt();
            totalHarga += hargaTiket[i]; // Menambahkan harga tiket ke total harga
        }

        // Mencetak total harga tiket
        System.out.println("\nTotal harga tiket: " + totalHarga);

        // Menutup Scanner
        scanner.close();
    }
}

