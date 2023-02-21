package za.co.marlonmagonjo;

import java.util.Optional;

class Stack {
    private Integer[] arr;
    private int top;
    private int limit;

    private static final int DEFAULT_LIMIT = 5;

    public Stack(){
        initialize(DEFAULT_LIMIT);
    }

    public Stack(int size){
        initialize(size);
    }

    private void initialize(int size){
        arr = new Integer[size];
        top = -1;
        limit = size;
    }

    public void push(Integer ele) throws StackException{
        if(top < limit - 1) {
            arr[++top] = ele;
        } else {
            throw new StackException("Stack Overflow");
        }
    }

    public Integer pop() throws StackException{
        if(isEmpty()){
            throw new StackException("Stack Empty");
        }
        return arr[top--];
    }

    public Optional<Integer> peek(){
        if(isEmpty()){
            return Optional.empty();
        }
        return Optional.of(arr[top]);
    }

    public boolean isEmpty(){
        return top == -1;
    }
}

class StackException extends Exception {
    public StackException(String reason){
        super(reason);
    }
}
public class StackProblem {

    public static void main(String[] args) throws StackException{
        Stack stk = new Stack(5);
        stk.push(10);
        stk.push(20);
        stk.push(30);
        stk.push(40);
        // stk.push(50);
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        // System.out.println(stk.pop());
        stk.push(45);

        Optional<Integer> peekValue = stk.peek();
        if(peekValue.isPresent()) {
            System.out.println(peekValue.get());
        }

        System.out.println(stk.peek());
        System.out.println(stk.pop());
    }
}
