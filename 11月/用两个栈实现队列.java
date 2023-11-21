import java.util.*;
import java.util.Stack;

public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.add(node);
    }

    public int pop() {
        if(stack1.isEmpty()){
            return -1;
        }
        while (!stack1.isEmpty()) {
            stack2.add(stack1.pop());
        }
        int pop=stack2.pop();
        while(!stack2.isEmpty()){
            stack1.add(stack2.pop());
        }
        return pop;
    }
}
