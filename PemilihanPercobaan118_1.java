import java.util.Scanner;

public class PemilihanPercobaan118_1 {
    
    public static void main(String[] args) {
        
        Scanner input18 = new Scanner(System.in);
        
        int Angka;
        String x;
        System.out.print("\nMasukkan Angka      : ");
        Angka = input18.nextInt();
        
        x = (Angka % 2 == 0) ? "Genap" : "Ganjil";

        System.out.println("Maka " + Angka + " Adalah " + x + "\n");

    }
}
