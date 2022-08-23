import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the values in a.a, b.b, c.c format: ");
        String inp = sc.nextLine();
        float[] vals = {0.0f,0.0f,0.0f};
        String[] spl = inp.split(",+");
        for (int i = 0; i < 3; i++){
            vals[i] = Integer.parseInt(spl[i]);
        }

        float u = (vals[0] + vals[1] + vals[2])/2;
        float area = (float) Math.sqrt(u * (u - vals[0]) * (u - vals[1]) * (u - vals[2]));
        System.out.println(String.format("The area of your triangle is: %f",area));
    }
}