import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the first number: ");
        int num2 = sc.nextInt();
        sc.nextLine(); //clear buff. I still don't know how to use this thing properly and have to rely on this hack.
        System.out.print("Enter the operation symbol (+,-,*,/): ");
        char op = sc.nextLine().charAt(0);
        System.out.print("Result: ");
        switch (op) {
            case '-':
                System.out.print(num1-num2);
                break;
            case '+':
                System.out.print(num1+num2);
                break;
            case '*':
                System.out.print(num1*num2);
                break;
            case '/':
                System.out.print(num1/num2);
                break;
        }
    }
}