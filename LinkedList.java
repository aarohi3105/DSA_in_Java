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
Node newNode= new Node(data);
if(head==null){
    head=newNode;
    tail=newNode;
    return;
}
tail.next=newNode;
tail=newNode;
    }
public void display(){
        Node tempNode=head;
        while(tempNode!=null){
            System.out.println(tempNode.data);
            tempNode=tempNode.next;
        }
}
    public static void main(String args[]) {
        LinkedList ll = new LinkedList();

        ll.addLast(23);
        ll.addLast(24);
        ll.addLast(25);
         ll.display();

    }
}
