import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input the base price: ");
        float bp = sc.nextFloat();
        System.out.print("\n Please input the tax value: ");
        float tax = bp > 1000 ? 0.8f : 0.18f;
        float withtax = bp*tax;
        System.out.println(String.format("\n With tax: %f\n Tax Amount: %f",bp+withtax, withtax));


    }
}