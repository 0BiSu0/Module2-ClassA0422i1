package ss10_dsa_stack_queue.practice.implement_stack_by_using_linkedlist;

public class GenericStackClient {
    public static void stackOfIStrings(){
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("1.1 Size of stack after push operations: " +  stack.size());
        System.out.println("1.2 Pop element from stack: ");
        while (!stack.isEmpty()){
            System.out.printf("%s", stack.pop());
        }
        System.out.println("\n.3. Size of stack after pop operation:  " + stack.size());

    }
    public static void stackOfIntegers(){
     MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("2.1 Size of stack after push operation: " + stack.size());
        System.out.println("2.2 Pop elements from stack: ");
        while (!stack.isEmpty()){
            System.out.printf("%d", stack.pop());
        }
        System.out.println("\n 3.3 Size of stack after pop operations: " + stack.size());
    }
        public static void main(String[] args) {
            System.out.println("1. Stack of integers");
            stackOfIntegers();
            System.out.println("2. Stack of Strings");
            stackOfIStrings();
        }

    }

