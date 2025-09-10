import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class StacknQueue {
    private String front;
    private String rear;
    private int size;
    private int count;
    private String[] elem;
    private boolean  _isStack;

    private static String randInt() {
        Random rnd = new Random();
        int number = rnd.nextInt(9999);
        return String.format("%04d", number);
    }

    public StacknQueue(int size, boolean _isStack) {
        this._isStack = _isStack;
        this.size = size;
        this.elem = new String[size];

        for (int i = 0; i < 10; i++) {
            String rand = randInt();
            this.elem[i] = rand;
        }

        if (_isStack) {
            this.count = size;
            this.front = this.elem[size];
            this.rear = this.elem[0];
        } else {
            this.count = 0;
            this.front = this.elem[0];
            this.rear = this.elem[size];
        }


    }

    public void push(String entry) {
        if (this._isStack) {
            if (this.count >= this.elem.length) {
                System.out.println("Stack is full!");
            } else {
                this.elem[this.count + 1] = randInt();
                this.count++;
            }
            
        } else {
            System.out.println("This is not a stack");
        }
    }

    public void push (){
        if (this._isStack) {
            if (this.count <= this.elem.length || this.elem[this.count] == null) {
                System.out.println("Stack is empty!");
            } else {
                this.elem[this.count] = null;
                this.count--;
            }
            
        } else {
            System.out.println("This is not a stack");
        }
    }
    
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new java.util.LinkedList<>();

        StacknQueue stk = new StacknQueue();
        StacknQueue q = new StacknQueue();

        for (int i = 0; i < 10; i++) {
            String rand = randInt();
            stack.push(rand);
            queue.add(rand);
        }

        System.out.println("Stack:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        System.out.println("\nQueue:");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
