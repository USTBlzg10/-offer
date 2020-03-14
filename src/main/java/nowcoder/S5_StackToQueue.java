package nowcoder;

import java.util.Stack;

/**
 * @author LiuZhiguo
 * @date 2019/9/17 10:56
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 */
public class S5_StackToQueue {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    public void push(int node) {
        stack1.push(node);
    }
    public int pop(){
        if (stack2.isEmpty()){
            while (!stack1.isEmpty()) {
                int out = stack1.pop();
                stack2.push(out);
            }
        }
        return stack2.pop();
    }
    public static void main(String[] args){
        S5_StackToQueue s5_stackToQueue = new S5_StackToQueue();
        int[] a = {1, 2, 3, 4, 5};
        for (int i=0;i<a.length;i++){
            s5_stackToQueue.push(a[i]);
        }
        System.out.println(s5_stackToQueue.pop());
    }
}
