package sample;

import java.util.Stack;

public class Calculator {

    int num = 0;
    String inputs = "";



    public void add(){
        inputs += "+";
    }

    public void subtract(){
        inputs += "-";
    }

    public void multiply(){
        inputs += "*";
    }

    public void divide(){
        inputs += "/";
    }

    public void equals(){

        Stack<Integer> stack = new Stack<Integer>();
        char operation = '+';

        for(int i = 0; i < inputs.length(); i++){

            if (Character.isDigit(inputs.charAt(i))){
                num = num * 10 + inputs.charAt(i) - '0';
            }

            if ((!Character.isDigit(inputs.charAt(i)) && ' ' != inputs.charAt(i))  || i == inputs.length() - 1){
                if(operation == '-') {
                    stack.push(-num);
                    num = 0;
                } else if(operation == '+') {
                    stack.push(num);
                    num = 0;
                } else if(operation == '*') {
                    stack.push(stack.pop() * num);
                    num = 0;
                } else if(operation == '/') {
                    stack.push(stack.pop() / num);
                    num = 0;
                }
                operation = inputs.charAt(i);
            }




        }

        int result = 0;
        for(int j : stack){
            result += j;

        }
        inputs = String.valueOf(result);
    }

    public void clear(){
        inputs = "";
    }

    public void num0(){
        inputs += 0;
    }

    public void num1(){
        inputs += "1";
    }

    public void num2(){
        inputs += "2";
    }

    public void num3(){
        inputs += "3";
    }

    public void num4(){
        inputs += "4";
    }

    public void num5(){
        inputs += "5";
    }

    public void num6(){
        inputs += "6";
    }

    public void num7(){
        inputs += "7";
    }

    public void num8(){
        inputs += "8";
    }

    public void num9(){
        inputs += "9";
    }

}