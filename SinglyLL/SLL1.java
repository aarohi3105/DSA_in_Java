package SinglyLL;


public class SLL1 {
    private class Node {
        int data;
        Node next;

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node head = null;
    private Node tail = null;

    public void add(int data) {
        Node newNode = new Node(data, null);
        if(head==null) {
            head = newNode;
            tail = newNode;
        }
        tail.next=newNode;
        tail=newNode;
    }
public void traversal(){
        Node temp=head;
        if(temp==null){
            System.out.println("empty list");
            return;
        }
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
}

    public static void main(String args[]) {
        SLL1 sll = new SLL1();
//        sll.add(10);
//        sll.add(20);
//        sll.add(30);
        sll.traversal();
    }
}

