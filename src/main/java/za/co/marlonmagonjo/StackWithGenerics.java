package za.co.marlonmagonjo;

import java.util.Optional;
import java.util.function.Supplier;

class StackExample<T> {
    private T[] arr;
    private int top;
    private int limit;

    private static final int DEFAULT_LIMIT = 5;

    public StackExample(Supplier<T []> supplier){
        initialize(supplier);
    }

    private void initialize(Supplier<T []> supplier){
        arr = supplier.get();
        top = -1;
        limit = arr.length;
    }

    public void push(T ele) throws StackException{
        if(top < limit - 1) {
            arr[++top] = ele;
        } else {
            throw new StackException("Stack Overflow");
        }
    }

    public T pop() throws StackException{
        if(isEmpty()){
            throw new StackException("Stack Empty");
        }
        return arr[top--];
    }

    public Optional<T> peek(){
        if(isEmpty()){
            return Optional.empty();
        }
        return Optional.of(arr[top]);
    }

    public boolean isEmpty(){
        return top == -1;
    }
}

class StackExampleException extends Exception {
    public StackExampleException(String reason){
        super(reason);
    }
}
public class StackWithGenerics {

    public static void main(String[] args) throws StackException{
        StackExample<Integer> stk = new StackExample<>(() -> new Integer[5]);
        stk.push(10);
        System.out.println(stk.pop());
        System.out.println("================================================");

        StackExample<Double> stackExample = new StackExample<>(() -> new Double[3]);
        stackExample.push(12.4);
        System.out.println(stackExample.pop());
        System.out.println("=================================================");
    }
}
