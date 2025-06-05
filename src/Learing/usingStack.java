package Learing;

import java.util.Stack;

public class usingStack {
    public static void main(String[] args) {

        String sc= "(){}[]";

     checking(sc);


    }
    static void checking(String s){

        Stack<Character> stack =new Stack<>();

        char[] arr= s.toCharArray();

        for (char ch: arr){
            if (stack.isEmpty()){
                stack.push(ch);
            }else {
                char top = stack.peek();

                if (ch - top == 1 || ch - top == 2){
                    stack.pop();
                }else {
                    stack.push(ch);
                }
            }
        }

    }
}
