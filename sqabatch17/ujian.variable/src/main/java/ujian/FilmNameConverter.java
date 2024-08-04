package ujian;

import java.util.Scanner;

public class FilmNameConverter {
    public static void main(String[] args) {
        // Membuat Scanner untuk membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan nama film
        System.out.print("Masukan nama film : ");
        String namaFilm = scanner.nextLine();

        // Mengubah nama film menjadi huruf besar
        String namaFilmDalamHurufBesar = namaFilm.toUpperCase();

        // Mencetak nama film dalam huruf besar
        System.out.println("Nama film dalam huruf besar : " + namaFilmDalamHurufBesar);

        // Menutup Scanner
        scanner.close();
    }
}
