package CodeGym;

import java.util.Collections;

public class CallStack {

    public static void main(String[] args){
       method1();
    }
    public static void method1(){
        method2();
    }
    public static void method2(){

       method3();
    }
    public static void method3(){
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement a: stackTraceElements
             ) {
            System.out.println(a.getMethodName());
        }
    }

}
