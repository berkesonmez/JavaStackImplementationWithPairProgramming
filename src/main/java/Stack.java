import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
    private int count;
    private List <T> stack;

    public Stack() {
        this.stack = new ArrayList();
        this.count = 0;
    }

    public int count() {
        return this.count;
    }

    public void push(T element) {
        this.stack.add(element);
        this.count++;
    }

    public Object peek() {
        return stack.get(stack.size()-1);
    }

    public Object pop(T testing) {
        Object poppedElement = stack.remove(stack.size() -1);
        return poppedElement;
    }
}
