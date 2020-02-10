package LeetCode;

public class MyArrayStack {

    int[] myStack = new int[100];
    int top = -1;

    public static void main(String[] args){
        MyArrayStack stack = new MyArrayStack();
        stack.push(1);
        System.out.println(stack.top());
        stack.push(2);
        System.out.println(stack.top());
        stack.pop();
        System.out.println(stack.top());
        System.out.println(stack.isEmpty());

    }

    public void push(int element){
        top = top+1;
        myStack[top] = element;
    }

    public int pop(){
        if(top == -1){
            return -1;
        }
        int value = 0;
        value = myStack[top];
        top = top-1;
        return value;
    }

    public boolean isEmpty(){
        if(top == -1){
            return true;
        }
        else {
            return false;
        }
    }

    public int top(){
       if(top != -1) {
           return myStack[top];
       }
       else {
           return -1;
       }
    }

}
