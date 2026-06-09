//Node creation in linkedlist

public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    public  Node head;
    public  Node tail;

    void addLast(int data){

    }
    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        LinkedList ll1 = new LinkedList();
        ll.addLast(23);
    }
}
