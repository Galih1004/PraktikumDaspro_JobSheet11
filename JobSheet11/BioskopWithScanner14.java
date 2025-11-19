import java.util.Scanner;

public class BioskopWithScanner14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2];

        int pilih = 0;

        while (pilih != 3) {
            System.out.println("1. Input Penonton");
            System.out.println("2. Tampilkan Penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            if (pilih == 1) {
                System.out.print("Baris: ");
                int b = sc.nextInt();
                System.out.print("Kolom: ");
                int k = sc.nextInt();
                sc.nextLine();

                if (b >= 4 || k >= 2) {
                    System.out.println("Kursi tidak tersedia!");
                } else if (penonton[b][k] != null) {
                    System.out.println("Kursi sudah terisi!");
                } else {
                    System.out.print("Masukkan nama: ");
                    penonton[b][k] = sc.nextLine();
                }

            } else if (pilih == 2) {
                for (int i = 0; i < 4; i++) {
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
    }
}
