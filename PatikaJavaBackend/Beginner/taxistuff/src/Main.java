import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the KM elapsed: ");
        float elapsed = sc.nextFloat();
        float total = 10.0f;
        total += elapsed*2.20f;
        if(total < 20) total = 20;
        System.out.println(String.format("\nFinal price: %f",total));
    }
}