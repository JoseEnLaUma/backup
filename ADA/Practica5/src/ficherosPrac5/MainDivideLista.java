package ficherosPrac5;

import java.util.ArrayList;
import java.util.List;

public class MainDivideLista {
    public static void main(String[] args) {
        DivideLista l = new DivideLista();
        int [] i = {12, 16, 18, 10, 0};
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        System.out.println(l.resolverVoraz(i, 2, a, b));
    }
}
