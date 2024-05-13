import java.util.ArrayList;
import java.util.Arrays;

public class LambdaExpression {

//    Syntax of Lambda Expressions
//
//    parameter -> expression
//            (parameter1, parameter2) -> expression
//            (parameter1, parameter2) -> { code block }
//
//    A lambda expression consists of the following:
//    A comma-separated list of formal parameters enclosed in parentheses.  You can omit the data type
//    of the parameters in a lambda expression. In addition, you can omit the parentheses if there is only
//    one parameter.A return statement is not an expression; in a lambda expression, you must enclose statements
//    in braces ({}). However, you do not have to enclose a void method invocation in braces.If you specify a single
//    expression, then the Java runtime evaluates the expression and then returns its value
//
//    1.   Use the three different types of lambda expressions with a forEach() or removeIf  method.

      private String[] name = { "Peter","John", "James","Simon","Bartholomew","Andrew","Jude","Matthew"};
      private Integer[] numbers ={1,2,3,5,6,7,8,9,10};

      private ArrayList<String> nameList = new ArrayList<>(Arrays.asList(name));
      private ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(numbers));

      public void trippleforEach() {

        System.out.print("name:");
        nameList.forEach(nameOfPerson -> System.out.print("| "+nameOfPerson));
        System.out.println();
        System.out.print("numbers:");
        numList.forEach(num -> {System.out.print(num + ", ");});
        System.out.println();
        System.out.print("numbers:");
        numList.forEach((num) -> {System.out.print(num + ", ");});
    }
}
