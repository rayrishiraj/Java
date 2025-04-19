package Stack;

import java.util.Arrays;

public class Stack {
    private int[] data;
    private int pointer = -1;
    final private int initial_capacity = 10;

    // Constructor to initialize the stack with a default capacity
    Stack() {
        data = new int[initial_capacity];
    }

    // Push a value onto the stack
    public boolean push(int value) {
        if (isFull()) {
            data = Arrays.copyOf(data, data.length * 2);
        }
        pointer++;
        data[pointer] = value;
        return true;
    }

    // Check if the stack is full
    public boolean isFull() {
        return pointer == data.length - 1;
    }

    // Peek at the top value of the stack without removing it
    public int peek() {
        if (pointer == -1) {
            throw new IllegalStateException("Stack is empty");
        }
        return data[pointer];
    }

    // Pop the top value from the stack and return it
    public int pop() {
        if (pointer == -1) {
            throw new IllegalStateException("Stack is empty");
        }
        int value = data[pointer];
        pointer--;  // Decrement pointer to remove the top element
        return value;
    }

    // Print the current elements in the stack
    public void print() {
        if (pointer == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack: ");
            for (int i = 0; i <= pointer; i++) {
                System.out.print(data[i] + " ");
            }
            System.out.println();  // Print a newline at the end
        }
    }
    public static void main(String[] args) {
        Stack stack = new Stack();
        
        // Push values onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        stack.print();  

        System.out.println("Peek: " + stack.peek()); 

        // Pop the top element and print it
        System.out.println("Popped: " + stack.pop());
        stack.print();  

        System.out.println("Peek: " + stack.peek());  
    }
}

