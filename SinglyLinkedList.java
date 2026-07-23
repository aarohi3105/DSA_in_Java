public class SinglyLinkedList {
    private class Node {
        int data;
        Node next;

       Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    private Node head=null;
    private Node tail=null;

    public void add(int data){
        Node newNode= new Node(data,null);
        if(head==null){
            head=newNode;
            tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;

    }
    public void display(){
        Node temp = head;
        if(temp==null){
            System.out.println("list is empty");
            return;
        }
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}

class MainApp {
    public static void main(String args[]) {
        SinglyLinkedList ll = new SinglyLinkedList();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.display();
    }
}