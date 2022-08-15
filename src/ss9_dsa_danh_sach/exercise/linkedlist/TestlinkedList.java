package ss9_dsa_danh_sach.exercise.linkedlist;

public class TestlinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> integerMyLinkedList = new LinkedList<>(5);
        integerMyLinkedList.addLast( null);
        System.out.println(integerMyLinkedList.size());
    }
}
