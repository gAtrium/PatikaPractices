import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] fruits = {"Pear","Apple","Tomatoes","Banana","Potato"};
        float[] prices = {2.14f,3.67f, 1.11f, 0.95f, 5.00f}; //we live in an economy
        float total = 0;

        for(int i = 0; i < 5; i++) {
            System.out.print(String.format("How many kilos of %s: ", fruits[i]));
            float buyed = sc.nextFloat();
            total+= buyed*prices[i];
        }


        System.out.println(String.format("Total cost: %f",total));
    }
}