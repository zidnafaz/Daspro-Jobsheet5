import java.util.Scanner;

public class Latihan01IfCondition18 {
    public static void main(String[] args) {
        Scanner sc18 = new Scanner(System.in);

        System.out.print("\nMasukkan Suhu         : ");
        
        int suhu = sc18.nextInt();

        if (suhu < 16) {
            System.out.println("Silahkan Menggunakan Jaket");
        }
        if (suhu < 20) {
            System.out.println("Silahkan Menggunakan Baju Tebal");
        }
        else {
            System.out.println("Silahkan Pakai Topi");
        }

    }
}