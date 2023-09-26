import java.util.*;

public class PemilihanPercobaan218 {
    
    public static void main(String[] args) {
        
        Scanner input18 = new Scanner(System.in);

        float
        Uas, Uts, Kuis, Tugas, Total;
        String
        message;

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

        message = (Total < 65) ? "Remedial" : "Tidak Remedial";

        System.out.println("_______________________________");
        System.out.println("Nilai Akhir           : " + Total + " Senhingga " + message);
        
    }
}