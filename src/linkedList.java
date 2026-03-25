import java.util.LinkedList;

public class linkedList {
    public static void main(String[] args) {
        LinkedList <Integer> l1 = new LinkedList<>(); //Capacity of LinkedList is not fixed, it can grow dynamically as we add more elements to it, and it does not have a default capacity like ArrayList
        LinkedList <Integer> l2 = new LinkedList<>();

        l1.add(1); //add() method is used to add elements to the list
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.addLast(111);
        l1.addFirst(1111);

        l2.add(11);
        l2.add(12);
        l2.add(13);

        l1.addAll(0,l2);

        for (int i = 0; i < l1.size(); i++) { //size() method is used to get the size of the list
            System.out.print(l1.get(i) + " ");
        }
    }
}
