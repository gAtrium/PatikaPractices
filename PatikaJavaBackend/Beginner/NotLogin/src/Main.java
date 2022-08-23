import java.io.Console;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Running this in ide might fail as you get null for console.
        Scanner sc = new Scanner(System.in);
        Console console = System.console();
        //New user

        System.out.print("Enter your username for registration: ");
        String un = sc.nextLine();
        boolean loggedin = false;
        String pass = getPass(console);
        System.out.println("Successfully created an user.");
        System.out.println("Super secure login thingy login:");
        sc.nextLine();//Just in case.
        while (!loggedin) {
            System.out.print("Username: ");
            String unl = sc.nextLine();
            System.out.print("Password: ");
            char[] passl = console.readPassword();
            if (Arrays.toString(passl).equals(pass) && unl.equals(un)) {
                loggedin = true;
                break;
            }
            else {
                System.out.print("Username/password mismatch. Would you like to reset your password? [Y/N]: ");
                char res = sc.nextLine().toLowerCase(Locale.ROOT).charAt(0);
                if(res == 'y'){
                    pass = getPass(console);
                    System.out.println("Successfully changed password");
                    System.out.println("Login");
                }
            }
        }
        System.out.println("Successfully created an user.");

    }

    static String getPass(Console console) {
        while (true) {
            System.out.print("Enter your new password : ");
            char[] passc = console.readPassword(); //Dont print to stdout, very sensitive info
            System.out.print("Confirm your password: ");
            char[] passvc = console.readPassword();
            if(Arrays.toString(passc).equals(Arrays.toString(passvc))){
                return(Arrays.toString(passvc));
            }
            else {
                System.out.println("Passwords do not match! Try again.");
            }
        }
    }
}