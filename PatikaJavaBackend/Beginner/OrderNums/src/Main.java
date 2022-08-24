import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the numbers in a, b, C format (integer): ");
        String inp = sc.nextLine();
        int[] vals = {0,0,0};
        String[] spl = inp.split(",+");
        for (int i = 0; i < 3; i++){
            vals[i] = Integer.parseInt(spl[i]);
        }
        for (int step = 1; step < vals.length; step++) {
            int key = vals[step];
            int j = step - 1;

            // Compare key with each element on the left of it until an element smaller than
            // it is found.
            // For descending order, change key<array[j] to key>array[j].
            while (j >= 0 && key < vals[j]) {
                vals[j + 1] = vals[j];
                --j;
            }

            // Place key at after the element just smaller than it.
            vals[j + 1] = key;
        }
        System.out.println(String.format("Sorted order is: %d > %d > %d",vals[2],vals[1],vals[0]));
    }
}