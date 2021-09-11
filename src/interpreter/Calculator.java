package interpreter;

import java.util.Stack;

public class Calculator {
    Expression expression;

    public Calculator(String expStr){
        Stack<Expression> stack=new Stack<>();
        char[] charArray = expStr.toCharArray();
        Expression left=null;
        Expression right=null;

        for (char c : charArray) {
            switch (c){
                case '+':
                    break;
                case '-':
                    break;
                default:
                    break;
            }
        }
    }
}
