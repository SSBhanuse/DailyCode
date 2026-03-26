import java.util.ArrayDeque;

public class arrayDeque {
    public static void main(String[] args) {
        //Capacity of ArrayDeque is not fixed, it can grow dynamically as we add more elements to it, and it does not have a default capacity like ArrayList
        ArrayDeque <Integer> d1 = new ArrayDeque<>();

        d1.add(1); //add() method is used to add elements to the deque
        d1.add(2);
        d1.add(3);
        d1.add(4);
        d1.add(5);
        d1.addFirst(111); //addFirst() method is used to add an element at the beginning of the deque
        d1.addLast(1111); //addLast() method is used to add an element at the end of the deque
        System.out.println(d1.getLast());
    }
}
