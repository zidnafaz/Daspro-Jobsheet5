import java.util.Scanner;

public class PemilihanPercobaan118 {
    
    public static void main(String[] args) {
        
        Scanner input18 = new Scanner(System.in);
    
        System.out.print("\nMasukkan Angka      : ");
        int Angka = input18.nextInt();
        

        if (Angka % 2 == 0) {
            System.out.println("Angka " + Angka + " Bilangan Genap\n");
        } else {
            System.out.println("Angka " + Angka + " Bilangan Ganjil\n");
        }
    }
}
