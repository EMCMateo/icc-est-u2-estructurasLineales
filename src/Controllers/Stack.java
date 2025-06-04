
package Controllers;
import Models.Node;
public class Stack {
    private Node top;

    public Stack ( ) {
        this.top = null;

    }

    public void push (int getValue){
        Node nodoNuevo = new Node(getValue);
        nodoNuevo.setNext(top); 
        top = nodoNuevo;    
    }

    public int pop(){
        if (isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        int value = top.getValue();
        top = top.getNext();
        return value;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return top.getValue();
        }

        public void stringStack(){
            Node current = top;
            while(current != null){
                System.out.println(current.getValue());
                current = current.getNext(); 
                
            }
            System.out.println("-----------------");

        }


    
}
