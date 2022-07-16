import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class PassedOrFailed {
    public static void main(String[] args) throws IOException {
        System.out.println("To pass, or not to pass, that is the question");
        int total = 0;
        Scanner scanner = new Scanner(System.in);
        String[] classes = new String[] {
                "Physics",
                "Chemistry",
                "Turkish Language",
                "History",
                "Music"
        };
        int i=0;
        mainloop:
        for(; i < classes.length;) {
            System.out.printf("Please enter %s note: ", classes[i]);
            int temp = -1;
            try{
                temp = scanner.nextInt();
            }
            catch (InputMismatchException ex){
                System.out.println("\nSorry, I couldn't quite catch that. try again maybe?");
                scanner.nextLine(); //Dirty hack to tell scanner to drop the internal buffer;
                continue  mainloop;
            }
            total+=temp;
            i++;
        }

        int average = total / classes.length;
        System.out.println(average > 60 ? "Congratulations, you passed." : "Sorry dude, you failed");
    }
}
