package nowcoder;

import java.util.Stack;

/**
 * @author LiuZhiguo
 * @date 2019/12/27 21:49
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
 */
public class S20_MinStack {
    Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> minStack = new Stack<Integer>();
    public void push(int node){
        if (minStack.isEmpty() || minStack.peek() > node)
            minStack.push(node);
        else minStack.push(minStack.peek());
    }
    public void pop(){
        stack.pop();
        minStack.pop();
    }
    public int peek(){
        return stack.peek();
    }
    public int min(){
        return minStack.peek();
    }
}
