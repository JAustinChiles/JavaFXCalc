package sample;

import java.util.Stack;

public class Calculator {

    Stack<Integer> stack = new Stack<Integer>();
    int num = 0;
    String inputs = "";
    char operation = '+';


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
        for(int i = 0; i < inputs.length(); i++){

            if (Character.isDigit(inputs.charAt(i))){
                num = num * 10 + inputs.charAt(i);
            }

            if (!Character.isDigit((inputs.charAt(i)))){
                if(operation == '-') {
                    stack.push(-num);
                } else if(operation == '+') {
                    stack.push(num);
                } else if(operation == '*') {
                    stack.push(stack.pop() * num);
                } else if(operation == '/') {
                    stack.push(stack.pop() / num);
                }
            }

            operation = inputs.charAt(i);

        }

        int result = 0;
        for(int i : stack){
            result += i;

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


    public void testFun(){
        System.out.println("BREHHHHHHHHHHHHH");
    }
}
