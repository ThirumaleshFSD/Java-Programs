import java.util.ArrayList;

public class SortReverse {
    public static void main(String[] args) {
         ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(5);
        list.add(20);
        list.add(1);

        // Sort in descending (reverse) order
        Collections.sort(list, Collections.reverseOrder());

        System.out.println("Reversed Sorted List: " + list);
    }
}
