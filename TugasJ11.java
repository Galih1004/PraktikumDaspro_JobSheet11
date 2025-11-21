import java.util.Scanner;

public class TugasJ11 {
    public static void main(String[] args) {
        Scanner mok = new Scanner (System.in);
        int[][] dataSurvey = new int [10][6];
        
    // input responden
        for (int i = 0; i < dataSurvey.length; i++) {
            System.out.println("Responden ke-" + (i+1));
            for (int j = 0; j < dataSurvey[i].length; j++) {
                System.out.print("Masukkan nilai (1-5) untuk pertanyaan ke-" + (j+1) + ": ");
                dataSurvey[i][j] = mok.nextInt();

                if (dataSurvey[i][j] < 1 || dataSurvey[i][j] > 5) {
                    System.out.println("Nilai harus antara 1 sampai 5. Silakan masukkan ulang.");
                    j--; // mengulang input untuk pertanyaan yang sama  
                }
            }
        }
    // menghitung rata rata responden
        System.out.println("\nRata-rata nilai untuk setiap responden:");
        for (int i=0; i < dataSurvey.length; i++) {
            int total = 0;
            for (int j = 0; j < dataSurvey[i].length; j++) {
                total += dataSurvey[i][j];
            }
            double rataRata = (double) total / dataSurvey[i].length;
            System.out.printf("Responden ke-%d: %.2f%n", (i+1), rataRata);
        }
    // menghitung rata rata pertanyaan
        System.out.println("\nRata-rata nilai untuk setiap pertanyaan:");
        for (int j = 0; j < dataSurvey[0].length; j++) {
            int total = 0;
            for (int i = 0; i < dataSurvey.length; i++) {
                total += dataSurvey[i][j];
            }
            double rataRata = (double) total / dataSurvey.length;
            System.out.printf("Pertanyaan ke-%d: %.2f%n", (j+1), rataRata);
        }
    // menghitung rata rata keseluruhan
        System.out.println("\nRata-rata nilai keseluruhan:");
        int totalKeseluruhan = 0;
        for (int i = 0; i < dataSurvey.length; i++) {
            for (int j = 0; j < dataSurvey[i].length; j++) {
                totalKeseluruhan += dataSurvey[i][j];
            }
        }
        double rataRataKeseluruhan = (double) totalKeseluruhan / (dataSurvey.length * dataSurvey[0].length);
        System.out.printf("\nRata-rata nilai keseluruhan: %.2f%n", rataRataKeseluruhan);
        mok.close();
    }   
}
