import java.util.*;
import java.util.LinkedList;

public class NewStack {

   LinkedList<String> newStack ;

   public NewStack(){
       newStack = new LinkedList<>();
   }

   public boolean isEmpty(){
       return newStack.isEmpty();
   }
   public int size(){
       return newStack.size();
   }

   public void push(String e){
       newStack.addLast(e);
   }

   public String pop(){
       return  newStack.removeLast();
   }

   public static void main(String[] args){
       NewStack testStack = new NewStack();
       testStack.push("there");
       testStack.push("hi");
       System.out.println(testStack.pop());
       System.out.println(testStack.pop());

       Stack<Character> javaStack = new Stack<>();

       javaStack.push('a');
       javaStack.push('b');

       System.out.println(javaStack.pop());


   }
}
