import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareTheTriplets {
    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);

        List<Integer> b = new ArrayList<>();
        b.add(3);
        b.add(2);
        b.add(1);

        System.out.println(compareTriplets(a,b));
    }

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

        int alicePoint = 0;
        int bobPoint = 0;
        for(int i = 0;i < b.size();i++) {
            if(a.get(i) > b.get(i)) {
                alicePoint++;
            }
            else if(a.get(i) < b.get(i)) {
                bobPoint++;
            }
        }
        return Arrays.asList(alicePoint, bobPoint);
    }
}
