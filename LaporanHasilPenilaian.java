
//Import class yang dibutuhkan
import java.util.Scanner;

public class LaporanHasilPenilaian {
    public static void main(String[] args) {
        // Deklarasi Variable
        String nama;
        char grade;
        final double nilaiQuiz, nilaiTugas, nilaiUts, nilaiUas, nilaiAkhir;
        // Inisialisasi objek untuk kelas
        Scanner scan = new Scanner(System.in);
        // Input
        System.out.print("Masukan Nama:");
        nama = scan.nextLine();

        System.out.print("Nilai Quiz : ");
        nilaiQuiz = scan.nextDouble();

        System.out.print("Nilai Tugas: ");
        nilaiTugas = scan.nextDouble();

        System.out.print("Nilai Uts  : ");
        nilaiUts = scan.nextDouble();

        System.out.print("Nilai Uas  : ");
        nilaiUas = scan.nextDouble();
        System.out.println("");
        // Hasil Input
        System.out.println("=================");
        System.out.println("  LAPORAN HASIL");
        System.out.println("=================");
        System.out.println("Nilai Quiz = " + nilaiQuiz);
        System.out.println("Nilai Tugas= " + nilaiTugas);
        System.out.println("Nilai UTS  = " + nilaiUts);
        System.out.println("Nilai UAS  = " + nilaiUas);
        System.out.println("=================");

        // Perhitungan bobot nilai sesuai ketentuan
        nilaiAkhir = (0.20 * nilaiQuiz + 0.20 * nilaiTugas + 0.30 * nilaiUts + 0.30 * nilaiUas);

        // Conditional Statment Menentukan Grade Nilai
        if (nilaiAkhir >= 85 && nilaiAkhir <= 100) {
            grade = 'A';
        } else if (nilaiAkhir > 80 && nilaiAkhir < 85) {
            grade = 'B';
        } else if (nilaiAkhir >= 70 && nilaiAkhir < 80) {
            grade = 'C';
        } else if (nilaiAkhir >= 50 && nilaiAkhir < 70) {
            grade = 'D';
        } else {
            grade = 'E';
        }

        if (grade == 'A' || grade == 'B' || grade == 'C') {
            System.out.println("Selamat " + nama + " Sudah Lulus");
            System.out.println("Nilai Total= " + nilaiAkhir);
            System.out.println("Grade Nilai= " + grade);

        } else if (grade == 'D' || grade == 'E') {
            if (nilaiAkhir < 70) {
                System.out.println("Maaf Kamu Tidak Lulus");
            }
            if (nilaiQuiz < 70) {
                System.out.println("Nilai Quiz masih kurang dari 70, Silahkan perbaikan terlebih dahulu");
            }
            if (nilaiTugas < 70) {
                System.out.println("Nilai Tugas masih kurang dari 70, Silahkan perbaikan terlebih dahulu");
            }
            if (nilaiUts < 70) {
                System.out.println("Nilai UTS masih kurang dari 70, Silahkan perbaikan terlebih dahulu");
            }
            if (nilaiUas < 70) {
                System.out.println("Nilai UAS masih kurang dari 70, Silahkan perbaikan terlebih dahulu");
            }
            {
                System.out.println("Nilai Total = " + nilaiAkhir);
                System.out.println("Grade Nilai = " + grade);

            }

        }

    }

}
