import java.util.Scanner;

public class PemilihanPercobaan318 {
    public static void main (String[] args){

        Scanner input18 = new Scanner(System.in);

        double Angka1,Angka2,hasil;
        char operator;

        System.out.print("Masukkan angka pertama        : ");
        Angka1 = input18.nextDouble();
        System.out.print("Masukkan angka Kedua          : ");
        Angka2 = input18.nextFloat();
        System.out.print("Masukkan operator (+ - * / )  : ");
        operator = input18.next().charAt(0);

        switch(operator){
            case '+':
                hasil = Angka1 + Angka2;
                System.out.println(Angka1 + " + " + Angka2 + " = " + hasil);
                break;
            case '-':
                hasil = Angka1 - Angka2;
                System.out.println(Angka1 + " - " + Angka2 + " = " + hasil);
                break;
            case '*':
                hasil = Angka1 * Angka2;
                System.out.println(Angka1 + " * " + Angka2 + " = " + hasil);
                break;
            case '/':
                hasil = Angka1 / Angka2;
                System.out.println(Angka1 + " / " + Angka2 + " = " + hasil);
                break;
            default:
                System.out.println("operator" + operator + "tidak ditemukan");
        }

    }
}
