package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Lab_002_LinkedList {
    public static void main(String[] args) {
        List l1 = new ArrayList();

        l1.add("Snehal");
        l1.add("Tambe");
        l1.add("9653221458");
        l1.add("QA");

        System.out.println("----------------");

        System.out.println("Size of ArrayList is " +l1.size());
        System.out.println("First element is : "+l1.getFirst());
        System.out.println("Last element is: "+l1.getLast());

        System.out.println("----------------");

        System.out.println("To print Arraylist element using for loop");
        for (int i=0; i<l1.size(); i++){

            System.out.println(l1.get(i));
        }

        l1.remove(3);

        System.out.println("----------------");

        System.out.println("Printing list element using Iterator and while loop");

        Iterator i2 = l1.iterator();
        while(i2.hasNext()){
            System.out.println(i2.next());
        }

        System.out.println("To print Arraylist using for each");
        for(Object o:l1){
            System.out.println(o.toString());
        }

        System.out.println("----------------");

        List l2 = new LinkedList();
        l2.add("Pankaj");
        l2.add("Patil");
        l2.add("9658741230");
        l2.add("Senior QA");

        System.out.println("Print linked list element using Iterator and while loop");

        Iterator i1 = l2.iterator();
        while(i1.hasNext())
        {
            System.out.println(i1.next());
        }

        System.out.println("----------------");

        System.out.println("Print Linked list using for loop");
        for (int i=0; i<l2.size(); i++){
            System.out.println(l2.get(i));
        }

        l2.remove(3);

        System.out.println("----------------");

        System.out.println("Print linked list using for each");
        for(Object o:l2){
            System.out.println(o.toString());
        }

        System.out.println("----------------");


    }
}
