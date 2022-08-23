import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the values (weight(kg),height(m)) in a.a,b.b format: ");
        String inp = sc.nextLine();
        float[] vals = {0.0f,0.0f};
        String[] spl = inp.split(",+");
        for (int i = 0; i < 2; i++){
            vals[i] = Float.parseFloat(spl[i]);
        };
        System.out.println(String.format("Your BMI is: %f", vals[0] / (vals[1] * vals[1])));
    }
}