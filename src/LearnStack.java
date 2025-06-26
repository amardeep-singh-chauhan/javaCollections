import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class LearnStack {

    public static void main(String[] args) {
        Stack<String> animals = new Stack<>(); // Stack is legacy but deque is modern
//        Deque<String> animals = new ArrayDeque<>();

        animals.push("Lion");
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");
        System.out.println(animals);

        System.out.println(animals.peek()); // to peek who is on top
        System.out.println(animals.pop()); // pop the last element
        animals.push("Monkey"); // to add element in last

        System.out.println(animals);
    }
}
