package org.example.Day14.StackUsingLinkedList;

public class Main {

    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(70);
        stack.push(30);
        stack.push(56);
        System.out.println("After pushing 3 Elements");
        stack.display();
        System.out.println("View the top element(Peek)");
        System.out.println(stack.peek());
        System.out.println("After popping the Elements");
        System.out.println("The POP element: "+stack.pop());
        stack.display();

    }
}
