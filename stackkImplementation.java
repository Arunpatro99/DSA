import java.util.*;

public class stackkImplementation {
        static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();
        public boolean isEmpty() {
       return  list.size() == 0;
    }
    /*method to insert element into the stack*/
    //push
    public void push(int data){
        list.add(data);
    }
    /*method to remove element from the stack*/
    //pop
    public int pop(){
        if(isEmpty()) {
            return -1;
        }
        int top=list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
    }
    /*method to return peek element*/
    //peek
    public int peek() {
        if(isEmpty()) {
            return -1;
        }
        return list.get(list.size()-1);
    }
}
public static void main(String args[]){
    Stack s= new Stack();
    s.push(10);
    s.push(20);
    s.push(30);
    s.push(40);
    while (!s.isEmpty()) {
        System.out.println(s.peek());
        s.pop();
    }
}
}