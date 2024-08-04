package ujian;

import java.util.Scanner;

public class FilmList {

    public static void main(String[] args) {
        // Membuat Scanner untuk membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Membuat array untuk menyimpan nama-nama film
        String[] daftarFilm = new String[5];

        // Meminta pengguna memasukkan nama lima film
        System.out.println("Daftar film bioskop");
        for (int i = 0; i < daftarFilm.length; i++) {
            System.out.print("Masukkan nama film " + (i + 1) + ": ");
            daftarFilm[i] = scanner.nextLine();
        }

        // Menampilkan daftar film yang dimasukkan
        System.out.println("\nFilm yang ingin ditonton:");
        for (int i = 0; i < daftarFilm.length; i++) {
            System.out.println((i + 1) + ". " + daftarFilm[i]);
        }

        // Menutup Scanner
        scanner.close();
    }
}

