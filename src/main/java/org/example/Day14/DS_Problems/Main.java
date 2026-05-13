package org.example.Day14.DS_Problems;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        System.out.println("Adding the elements at the Beginning");
        list.add(70);
        list.add(30);
        list.add(56);
        list.display();

        System.out.println("Adding the elements at the End(Appending)");
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.append(56);
        list2.display();
        System.out.println("After delete");
        list2.deleteLastElement();
        list2.display();
        list2.append(30);
        list2.append(70);
        list2.display();

        System.out.println("After insert the element in Between the LinkedList");
        list2.insert(56,25);
        list2.display();

        System.out.println("Adding the elements at the End(Appending)");
        LinkedList<Integer> list3= new LinkedList<>();
        list3.append(56);
        list3.append(70);
        list3.display();
        System.out.println("After insert the element in Between the LinkedList");
        list3.insert(56,30);
        list3.display();
        System.out.println("After deleting the element at the last");
        list3.deleteLastElement();
        list3.display();

        if(list3.find(30)){
            System.out.println("The element is present in the LinkedList");
        }
        else{
            System.out.println("The element is not present in the LinkedList");
        }
        list3.insert(56,40);
        list3.display();


        System.out.println("After deleting the particular element in the list");
        list3.deleteParticular(40);
        System.out.println("The Size of the LinkedList: "+list3.size());

        list3.display();

    }
}
