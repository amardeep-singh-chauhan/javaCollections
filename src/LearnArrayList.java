import java.util.ArrayList;
import java.util.List;

public class LearnArrayList {

    public static void main(String[] args) {

//        String[] students = new String[30];
//
//        students[30] = "Ajay";

//        cannot do this as I will below error
//        java.lang.ArrayIndexOutOfBoundsException: Index 30 out of bounds for length 30

        List<String> students = new ArrayList<>();
        students.add("Ajay");

        System.out.println(students);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

//        to add any element at particular index
        list.add(1, 50);

        System.out.println(list);

        ArrayList<Integer> newlist = new ArrayList<>();
        newlist.add(10);
        newlist.add(20);

        list.addAll(newlist); // to add new list in current list;

        System.out.println(list);

        System.out.println(list.get(2)); // to get the element from particular index
        list.remove(2); // to remove element from index
        list.remove(Integer.valueOf(50)); // to remove element directly
        list.set(1, 100); // set the value at particular index
        System.out.println(list.contains(100)); // to check it contains the elements or not

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (Integer integer : list) { // forEach loop
            System.out.println(integer);
        }

//        list.clear(); // to clear list

        System.out.println(list);
    }
}
