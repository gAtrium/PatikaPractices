import java.util.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Trips<U, V, T> {
    public final U first;
    public final V second;
    public final T third;

    // Check em
    public Trips(U first, V second, T third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }
}

class Dubs<U, V> {
    public final U first;
    public final V second;

    // Check em
    public Dubs(U first, V second) {
        this.first = first;
        this.second = second;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the date in in MM/DD format: ");
        String inp = sc.nextLine();
        List<Dubs<Integer, String>> thething = new ArrayList<>(){{ //Idgaf about how months end
            add(new Dubs<>(19, "Capricorn"));
            add(new Dubs<>(18, "Aquarius"));
            add(new Dubs<>(20, "Pisces"));
            add(new Dubs<>(19, "Aries"));
            add(new Dubs<>(20, "Taurus"));
            add(new Dubs<>(21, "Gemini"));
            add(new Dubs<>(22, "Cancer"));
            add(new Dubs<>(22, "Leo"));
            add(new Dubs<>(23, "Virgo"));
            add(new Dubs<>(21, "Libra"));
            add(new Dubs<>(21, "Scorpius"));
            add(new Dubs<>(21, "Sagittarius"));
            add(new Dubs<>(19, "Capricorn"));//Hack
            }};
        int[] vals = {0,0};
        String[] spl = inp.split("/+");
        for (int i = 0; i < 2; i++){
            vals[i] = Integer.parseInt(spl[i]);
        };
        vals[0]--;//hack
        System.out.print("You are a ");
        System.out.println(vals[1] < thething.get(vals[0]).first ? thething.get(vals[0]).second:thething.get(vals[0]+1).second);

    }
}