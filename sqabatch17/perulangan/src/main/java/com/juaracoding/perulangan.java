public class SegitigaSikuTerbalik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna untuk tinggi segitiga
        System.out.print("Masukkan tinggi segitiga: ");
        int tinggi = scanner.nextInt();

        // Menutup scanner
        scanner.close();

        // Mencetak segitiga siku-siku terbalik dengan spasi
        for (int i = tinggi; i >= 1; i--) {
            // Mencetak spasi untuk membuat segitiga terbalik
            for (int j = 1; j <= tinggi - i; j++) {
                System.out.print("  "); // Spasi untuk menyusun bentuk segitiga
            }
            // Mencetak bintang
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
