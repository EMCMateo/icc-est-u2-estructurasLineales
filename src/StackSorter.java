
import Controllers.StackGenerico;
public class StackSorter {

    public void sortStack(StackGenerico<Integer> stack) {
        StackGenerico<Integer> tempStack = new StackGenerico<>();

        while (!stack.isEmpty()) {
            int temp = stack.pop();

            // Reubicar en tempStack mientras sus elementos sean mayores que temp
            while (!tempStack.isEmpty() && tempStack.peek() > temp) {
                stack.push(tempStack.pop());
            }

            tempStack.push(temp);
        }

        // Volver a mover los elementos al stack original (ya estarán ordenados)
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }
}