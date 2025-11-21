import java.util.Scanner;

public class BioskopWithScanner14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2];
        String[] film = new String[4]; // Array untuk menampung nama film

        int pilih = 0;

        while (pilih != 4) { // Diubah karena ada menu baru
            System.out.println("1. Input Film");
            System.out.println("2. Input Penonton");
            System.out.println("3. Tampilkan Penonton");
            System.out.println("4. Exit"); // Menu exit diubah
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            if (pilih == 1) {
                System.out.print("Masukkan baris untuk film (0-3): ");
                int barisFilm = sc.nextInt();
                sc.nextLine(); // consume newline

                if (barisFilm >= 0 && barisFilm < 4) {
                    System.out.print("Masukkan judul film: ");
                    film[barisFilm] = sc.nextLine();
                    System.out.println("Film berhasil ditambahkan.");
                } else {
                    System.out.println("Baris tidak valid.");
                }
            } else if (pilih == 2) {
                System.out.print("Baris: ");
                int b = sc.nextInt();
                System.out.print("Kolom: ");
                int k = sc.nextInt();
                sc.nextLine();

                if (b < 0 || b >= 4 || k < 0 || k >= 2) {
                    System.out.println("Kursi tidak tersedia!");
                } else if (film[b] == null) {
                    System.out.println("Belum ada film di baris ini. Silakan input film terlebih dahulu.");
                } else if (penonton[b][k] != null) {
                    System.out.println("Kursi sudah terisi!");
                } else {
                    System.out.print("Masukkan nama: ");
                    penonton[b][k] = sc.nextLine();
                }

            } else if (pilih == 3) {
                for (int i = 0; i < 4; i++) {
                    String judulFilm = film[i] != null ? film[i] : "N/A";
                    System.out.println("Baris " + i + " - Film: " + judulFilm);
                    for (int j = 0; j < 2; j++) {
                        if (penonton[i][j] == null) {
                            System.out.print("*** ");
                        } else {
                            System.out.print(penonton[i][j] + " ");
                        }
                    }
                    System.out.println();
                }
            }
        }
        sc.close();
    }
}
