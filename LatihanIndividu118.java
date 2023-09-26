import java.util.Scanner;

public class LatihanIndividu118 {
    public static void main(String[] args) {
    Scanner inputJarak = new Scanner(System.in);

        int 
        Jarak;

        System.out.print("Masukkan Jarak      : ");
        Jarak = inputJarak.nextInt();

        System.out.print("Dengan jarak " + Jarak + " maka ");
        if (Jarak <= 5) {
            System.out.println("Gunakan senjata Melee Weapon");
        } else if (Jarak > 5) {
            System.out.println("Gunakan senjata Range Weapon");
        }

    }
}