import java.util.*;

public class PemilihanPercobaan218_1 {
    
    public static void main(String[] args) {
        
        Scanner input18 = new Scanner(System.in);

        float
        Uas, Uts, Kuis, Tugas, Total;
        String
        message, nilaiHuruf="";

        System.out.println("\n========== Rekap Nilai ==========\n");
        System.out.print("Masukkan Nilai UAS      : ");
        Uas = input18.nextFloat();
        System.out.print("Masukkan Nilai UTS      : ");
        Uts = input18.nextFloat();
        System.out.print("Masukkan Nilai Kuis     : ");
        Kuis = input18.nextFloat();
        System.out.print("Masukkan Nilai Tugas    : ");
        Tugas = input18.nextFloat();

        Total = (Uas * 0.4F) + (Uts * 0.3F) + (Kuis * 0.1F) + (Tugas * 0.2F);

        if (Total > 80 && Total <= 100) {
            nilaiHuruf = "A (Sangat Baik)";
        } else if (Total >= 73 && Total <= 80) {
            nilaiHuruf = "B+ (Lebih dari baik)";
        } else if (Total >= 65 && Total <= 73) {
            nilaiHuruf = "B (Baik)";
        } else if (Total >= 60 && Total <= 65) {
            nilaiHuruf = "C+ (Lebih dari Cukup)";
        } else if (Total >= 50 && Total <= 60){
            nilaiHuruf = "C (Cukup)";
        } else if (Total >= 39 && Total <= 50) {
            nilaiHuruf = "D (Kurang)";
        } else if (Total >= 0 && Total <= 39) {
            nilaiHuruf = "E (Gagal)";
        }

        message = (Total < 65) ? "Remedial" : "Tidak Remedial";

        System.out.println("_______________________________");
        System.out.println("Nilai Akhir           : " + Total + " Sehingga " + message);
        System.out.println("Nilai Mutu            : " + nilaiHuruf);
    }
}