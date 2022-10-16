/* Stack Implementation through java collection framework
 * operation performed 
 * push
 * pop
 * peek
*/
/* import java.util.*;  
The type stack is not generic, it cannot be parameterized with argements 
*/
import java.util.Stack;
public class StackImplementationn {
    public static void main(String args[]) {
        Stack<Integer> s = new Stack<>();
        s.push(40);
        s.push(50);
        s.push(60);
        s.push(70); 

        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
