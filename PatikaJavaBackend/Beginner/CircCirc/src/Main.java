import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the values in a.a,b.b format: ");
        String inp = sc.nextLine();
        float[] vals = {0.0f,0.0f};
        String[] spl = inp.split(",+");
        for (int i = 0; i < 2; i++){
            vals[i] = Integer.parseInt(spl[i]);
        };
        System.out.println(String.format("The area of your inputted section of a circle is: %f",(Math.PI*(vals[0]/2*vals[0]/2)  * vals[1]) /360));
    }
}