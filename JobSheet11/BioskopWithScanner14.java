import java.util.Scanner;

public class BioskopWithScanner14 {
    public static void main(String[] args) {
        Scanner mok = new Scanner(System.in);
        String[][] penonton = new String[4][2];
        
        while(true) {
            System.out.print("Masukkan nama :");
            String nama = mok.nextLine();
            System.out.print("Masukkan baris :");
            int baris = mok.nextInt();
            System.out.print("Masukkan kolom :");
            int kolom = mok.nextInt();
            mok.nextLine();

            penonton[baris-1][kolom-1] = nama;

            System.out.print("Input Penonton lain? (y/n) : ");
            String next = mok.nextLine();

            if(next.equalsIgnoreCase("n")) {
                break;
            }
        }
        mok.close();
    }
    
}
