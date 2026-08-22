import java.util.*;

class StackArray{
    int top;
    int capacity;
    int[]arr;
    StackArray(int size){
        arr = new int[size];
        top=-1;
        capacity=size;
    }

    public void push(int data){
        if(top==capacity-1){
            System.out.println("stack is full");
            return;
        }
        top++;
        arr[top]=data;
    }

    public void traversal(){
        for(int i=top;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }
    public int peek(){
        if(top==-1){
           // throw new EmptyStackException();
            System.out.println("stack is empty");
        }
        return arr[top];
    }

    public int pop(){
        if(top==-1){
            //throw new EmptyStackException();
            System.out.println("stack is empty");
            return -1;
        }
        int temp=arr[top];
        top--;
        return temp;
    }
}


public class StackBasics {
    public static void main(String args[]){
        StackArray stack = new StackArray(6);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.traversal();
        System.out.println("peek element is " + stack.peek());
        System.out.println("popped element is "+stack.pop());
        System.out.println("popped element is "+stack.pop());
        System.out.println("popped element is "+stack.pop());
        System.out.println("popped element is "+stack.pop());
        System.out.println("popped element is "+stack.pop());
        stack.traversal();
        System.out.println(stack.pop());

        stack.push(50);
        stack.traversal();
    }
}
