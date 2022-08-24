import java.util.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
        String[] signs = {"Monkey", "Rooster", "Dog", "Pig", "Mouse", "Bull", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Sheep"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the year you were born: ");
        int inp = sc.nextInt();
        System.out.print("You are a ");
        System.out.println(signs[inp%12]);
    }
}