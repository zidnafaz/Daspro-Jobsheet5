import java.util.Scanner;

public class LatihanIndividu218 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String username, password;

        System.out.println("=================");
        System.out.println("======LOGIN======");
        System.out.print("Masukkan Username : ");
        username = input.next();
        System.out.print("Masukkan Password : ");
        password = input.next();

        if (username.equals("User1") && password.equals("IniUser1")) {
            System.out.println("Login Successfully\n");
        } else {
            System.out.println("Failed Login Please Try Again or Create Account via Admin\n");
        }
    }
}
