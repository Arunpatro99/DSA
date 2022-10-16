/*Reverse a Stack Implicit stack-recursion*/
import java.util.Stack;
public class ReverseStack {
    public static void pushAtEnd(int data, Stack<Integer> s){
    if(s.empty()){
    s.push(data);
    return;
}
    int top = s.pop();
    pushAtEnd(data, s);
    s.push(top);
}

public static void reverse(Stack<Integer> s){
    if(s.isEmpty()) {
        return;
    }
    int top = s.pop();
    reverse(s);
    pushAtEnd(top, s);
}
public static void main(String args[]){
    Stack<Integer> s = new Stack<>();
    s.push(10);
    s.push(20);
    s.push(30);

    reverse(s);
    while(!s.isEmpty()) {
        System.out.println(s.peek());
        s.pop();
    }
}
}