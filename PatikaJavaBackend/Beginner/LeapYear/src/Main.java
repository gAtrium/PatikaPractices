import java.util.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the year : ");
        int inp = sc.nextInt();
        if(inp % 4 == 0) {
            if(inp % 100 == 0) {
                if(inp % 400 == 0){
                    System.out.println(String.format("%d is a leap year.",inp));
                    return;
                }
                System.out.println(String.format("%d is not a leap year.",inp));
                return;
            }
            System.out.println(String.format("%d is a leap year.",inp));
            return;
        }
        System.out.println(String.format("%d is not a leap year.",inp));
    }
}