

import Controllers.Queue;
import Controllers.QueueGenerico;
import Models.Persona;
import Controllers.Stack;
import Controllers.StackGenerico;

public class App {
    public static void main(String[] args) throws Exception {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(-1);
        stack.push(0);
        stack.push(5);
        stack.size();
        stack.sizeO1();
        stack.stringStack();
        
        stack.pop();
        stack.peek();
        stack.size();
        stack.sizeO1();
        stack.stringStack();


        
        System.out.println("============================================================");
        StackGenerico<String> stackGenericoString = new StackGenerico<>();
        stackGenericoString.push("UNO");
        stackGenericoString.push("CUATRO");
        stackGenericoString.push("CINCO");
        stackGenericoString.stringStack();
        stackGenericoString.size();
        stackGenericoString.pop();
        stackGenericoString.size();
        stackGenericoString.stringStack();

        System.out.println("============================================================");
        StackGenerico<Integer> stackGenericoInt = new StackGenerico<>();
        stackGenericoInt.push(25);
        stackGenericoInt.push(36);
        stackGenericoInt.push(14);
        stackGenericoInt.size();
        stackGenericoInt.stringStack();
        stackGenericoInt.pop();
        stackGenericoInt.size();
        stackGenericoInt.stringStack();

        System.out.println("============================================================");
        Queue queue = new Queue();
        queue.add(2);
        queue.add(8);
        queue.add(15);
        queue.stringQueue();
        System.out.println(queue.size);
        queue.remove();
        queue.remove();
        queue.stringQueue();
        System.out.println(queue.size);


        Persona p1 = new Persona ("PABLO");
        Persona p2 = new Persona ("JUAN");
        Persona p3 = new Persona ("MATEO");

        QueueGenerico <Persona> queuePersonas = new QueueGenerico<Persona>();
        queuePersonas.add(p1);
        queuePersonas.add(p2);
        queuePersonas.add(p3);
        queuePersonas.size();
        queuePersonas.stringQueue();
        queuePersonas.remove();
        queuePersonas.size();
        queuePersonas.stringQueue();

    
        
    }
}
