import java.util.Scanner;

public class PenilaianSiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai siswa: ");
        int nilai = input.nextInt();

        String grade;
        String Hasil;

        if (nilai >= 85 && nilai <= 100) {
            grade = "A";
            Hasil = "Lulus";
        } else if (nilai >= 70 && nilai <= 84) {
            grade = "B";
            Hasil = "Lulus";
        } else if (nilai >= 50 && nilai <= 69) {
            grade = "C";
            Hasil = "Lulus";
        } else if (nilai >= 40 && nilai <= 49) {
            grade = "D";
            Hasil = "Tidak Lulus";
        } else if (nilai >= 0 && nilai <= 39) {
            grade = "E";
            Hasil = "Tidak Lulus";
        } else {
            grade = "Tidak Valid";
            Hasil = "Nilai di luar rentang yang valid.";
        }

        System.out.println("Grade: " + grade);
        System.out.println("Hasil: " + Hasil);
    }
}
