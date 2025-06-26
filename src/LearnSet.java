import java.util.HashSet;
import java.util.Set;

public class LearnSet {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        set.add(11); // to add element in set
        set.add(31);
        set.add(21);
        set.add(41);
        System.out.println(set);

        set.remove(21); // to remove the value from set
        System.out.println(set.contains(41)); // to check set has that value or not
        System.out.println(set.isEmpty()); // to check set is empty or not
        System.out.println(set.size()); // to know the element size of set

        System.out.println(set);
        set.clear();
        System.out.println(set);


    }
}
