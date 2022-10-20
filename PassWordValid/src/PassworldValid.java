import java.util.Scanner;
import PasswordCheck.isVal;

public class PassworldValid {

    public static void main(String[] args) throws Exception {
        System.out.println("Enter a password between 8 and 16 characters in length: ");
        Scanner scnr = new Scanner(System.in);
        String password = scnr.next();
        isVal.isPassValid(password);
        scnr.close();
    }
}
