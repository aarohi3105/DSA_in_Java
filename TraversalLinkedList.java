public class TraversalLinkedList {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }
        Node head;
        Node tail;

        void insertLast(int data){
            Node newNode = new Node(data);

                if(head==null){
                    head=newNode;
                    tail=newNode;
                    return;
                }
            tail.next=newNode;
            tail=newNode;
        }

        public void insertFirst(int data){
            Node newNode = new Node(data);
            if(head==null){
                head=newNode;
                tail=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;

        }


        public void insertMiddle(int after,int data){
            Node newNode = new Node(data);
            if(head==null){
                head=newNode;
                tail=newNode;
                return;
            }

            Node tempNode= head;
            while(tempNode != null && tempNode.data != after){
                tempNode = tempNode.next;
            }
            if(tempNode == null){
                System.out.println("Element not found");
                return;
            }
            newNode.next=tempNode.next;
            tempNode.next=newNode;

            if(tempNode == tail){
                tail = newNode;
            }
        }
        public void display(){
            if(head==null){
                System.out.println("list is empty");
                return;
            }

                Node tempNode= head;
                while(tempNode!=null){
                    System.out.println(tempNode.data);
                    tempNode=tempNode.next;

            }
        }
    public static void main(String args[]){
        TraversalLinkedList  ll = new TraversalLinkedList ();
        ll.insertLast(10);
        ll.insertLast(20);
        ll.insertLast(30);
ll.display();
        System.out.println("-----------------------------");
        ll.insertFirst(40);
        ll.display();
        System.out.println("-----------------------------");
        ll.insertMiddle(20,60);
        ll.display();
    }
}

