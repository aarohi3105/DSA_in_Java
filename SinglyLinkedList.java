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

    public void addFirst(int data){
       Node newNode = new Node(data,null);
       if(head==null){
           head=newNode;
           tail=newNode;
           return;
       }
       newNode.next=head;
       head=newNode;



    }

    public void addLast(int data){
        Node newNode= new Node(data,null);
        if(head==null){
            head=newNode;
            tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }

    public void mid(int data,int index){
        Node newNode= new Node(data,null);
        if(head==null){
            head=newNode;
            tail=newNode;
            return;
        }
        Node temp=head;
       for(int i=1;i<index-1;i++){
           if(index < 0)
           {
               throw new IndexOutOfBoundsException("Invalid Index Position");
           }
           if(index == 0)
           {
               addFirst(data);
               return;
           }

//           if(index > )
//           {
//               throw new IndexOutOfBoundsException("Invalid Index Position");
//           }

           temp=temp.next;
        }
       Node ref=temp.next;
       temp.next=newNode;
       newNode.next=ref;
    }
    public void removeFirst(){
        if(head==null){
            throw new EmptyListException("List is empty");
        }
        head=head.next;

    }
public void removeLast(){
        if(head==null){
            throw new EmptyListException("List is empty");
        }

}
}
class EmptyListException extends RuntimeException {
    public EmptyListException(String message) {
        super(message);
    }
}

class MainApp {
    public static void main(String args[]) {
        SinglyLinkedList ll = new SinglyLinkedList();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.display();
        ll.addFirst(40);
        System.out.println("-------------------------");
        ll.display();
        ll.addLast(60);
        System.out.println("-------------------------");
        ll.display();
        ll.mid(100,1);
        System.out.println("-------------------------");
        ll.display();
        ll.removeFirst();
        System.out.println("-------------------------");
        ll.display();
    }
}