import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Float> random = new ArrayList<Float>();
        random.add(2f);
        random.add(4f);
        random.add(5f);
        random.add(10f);
        random.add(99.9f);
        random.add(101f);

        iterateAltn(random);
    }

    public static void iterateAltn(List<Float> num) {
        for (int i = 1; i < num.size(); i += 2) {
            ListIterator<Float> iterator = num.listIterator(i);
            System.out.println(iterator.next());
        }
    }
}