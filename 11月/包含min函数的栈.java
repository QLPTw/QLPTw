import java.util.*;
import java.util.Stack;

public class Solution {

    Stack<Integer> stack = new Stack();
    public void push(int node) {
        stack.add(node);
    }

    public void pop() {
        if (stack.isEmpty()){
            return;
        }
            stack.pop();
    }

    public int top() {
        if(stack.isEmpty()){
            return -1;
        }
        return stack.peek();
    }

    public int min() {
        if(stack.isEmpty()){
            return -1;
        }
        Stack<Integer> stack02=new Stack();
        int temp=stack.peek();
        while(!stack.isEmpty()){
            stack02.add(stack.pop());
            if(stack02.peek()<temp){
                temp=stack02.peek();
            }
        }
        while(!stack02.isEmpty()){
            stack.add(stack02.pop());
        }
        return temp;
    }
}
