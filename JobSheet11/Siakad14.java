import java.util.Scanner;

public class Siakad14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah Mahasiswa: ");
        int mhsSiswa = sc.nextInt();

        System.out.print("Jumlah mata kuliah: ");
        int mataKul = sc.nextInt();

        int[][] nilai = new int[mhsSiswa][mataKul];

        for (int i = 0; i < mhsSiswa; i++) {
            for (int j = 0; j < mataKul; j++) {
                System.out.print("Nilai siswa " + i + " MK " + j + ": ");
                nilai[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }
}
