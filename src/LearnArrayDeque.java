import java.util.ArrayDeque;
import java.util.Deque;

public class LearnArrayDeque {

    public static void main(String[] args) {
        Deque<String> animals = new ArrayDeque<>();

        animals.push("Lion");
        animals.push("Dog");
        animals.push("Cat");
        System.out.println(animals);

        System.out.println(animals.peek()); // to peek who is on top
        System.out.println(animals.peekFirst()); // to peek who is in top similar to peek
        System.out.println(animals.peekLast()); // to peek who is in last
        System.out.println(animals.pop()); // pop the first element
        System.out.println(animals.poll()); // pop the first element
        System.out.println(animals.pollFirst()); // pop the first element
        System.out.println(animals.pollLast()); // pop the last element
        animals.push("Monkey"); // to add element in first position

        animals.offer("Panda"); // to add element in last position
        animals.offerLast("Horse"); // to add element in last position similar to offer
        animals.offerFirst("Cow"); // to add the element in first position like push

        System.out.println(animals);
    }
}
