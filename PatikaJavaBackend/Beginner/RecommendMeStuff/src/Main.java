import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temp outside: (in  C): ");
        int deg = sc.nextInt();
        if(deg < 5) System.out.println("Do some skateboarding, break a few bones");
        else if(deg >= 5 && deg < 15) System.out.println("Head over to a cinema");
        else if(deg >= 15 && deg <25) System.out.println("Do a picnic");
        else if(deg>=25)System.out.println("Go swim");
    }
}