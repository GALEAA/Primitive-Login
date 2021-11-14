import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String id, pw;

        Scanner login = new Scanner(System.in);
        System.out.print("ID:   ");
        id = login.nextLine();

        System.out.print("PW:   ");
        pw = login.nextLine();

        if (id.equals("admin") && pw.equals("123456")) {
            System.out.print("Logged in succesfully");
        }
        else {
            System.out.print("Try again");
        }
    }
}
