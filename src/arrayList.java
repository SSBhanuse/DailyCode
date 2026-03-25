import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList <Integer> l1 = new ArrayList<>(); //Capacity of ArrayList is 10 by default, and it can grow dynamically as we add more elements to it
        ArrayList <Integer> l2 = new ArrayList<>(5); //We can also specify the initial capacity of the ArrayList using the constructor

        l1.add(1); //add() method is used to add elements to the list
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(1);

        //l1.add(0,5); //Same [list.addFirst(5)] addFirst() is used to add element at the beginning of the list

        l2.add(11);
        l2.add(12);
        l2.add(13);
        l2.add(14);
        l2.add(15);
        l2.add(16); //When we try to add the 6th element to l2, it will automatically increase its capacity to accommodate the new element

        l1.addAll(l2); //addAll() method is used to add all the elements of one list to another list, it will add all the elements at the end of the list

        //l1.addAll(0,l2); //It will add all the elements at the specified index of the list

        //l1.clear(); //clear() method is used to remove all the elements from the list, it will make the list empty

        /*contains() method is used to check if the list contains a specific element,
        it will return true if the element is present in the list, otherwise it will return false*/
        //System.out.println(l1.contains(5));

        /*indexOf() method is used to get the index of the first occurrence of a specific element in the list,
        it will return the index of the element if it is present in the list, otherwise it will return,
        if there are multiple occurrences of the element, it will return the index of the first occurrence [ex.(1,2,3,4,2) it will pick the first occurrence]*/
        //System.out.println(l1.indexOf(1));

        //l1.set(0, 100); //set() method is used to replace the element at the specified index with the new element

        //System.out.println(l1.isEmpty()); //isEmpty() method is used to check if the list is empty or not, it will return true if the list is empty, otherwise it will return false

        //System.out.println(l1.lastIndexOf(1));

        //iterator() method is used to get an iterator for the list, it will return an iterator object that can be used to iterate through the list
        //System.out.println(l1.iterator());

        for (int i = 0; i < l1.size(); i++) { //size() method is used to get the size of the list
            System.out.print(l1.get(i) + " ");
        }
    }
}
