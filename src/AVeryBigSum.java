import java.util.ArrayList;
import java.util.List;

public class AVeryBigSum {
    public static void main(String[] args) {

        List<Long> ar = new ArrayList<>();
        ar.add((long) 1000000001);
        ar.add((long) 1000000002);
        ar.add((long) 1000000003);
        ar.add((long) 1000000004);
        ar.add((long) 1000000005);

        System.out.println(aVeryBigSum(ar));
    }

    public static long aVeryBigSum(List<Long> ar) {
        long sum = 0;
        for (Long num : ar) {
            sum = sum + num;
        }
        return sum;
    }
}
