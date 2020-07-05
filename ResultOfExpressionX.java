/* Exercise 2:
   What is the result of the expression -x + x++ - --x + x; where x = 1. Why? Can you explain?
Explanation: 
When the ++ operator placed after a variable, the value of the expression x++ is the original value of x before it was incremented.
The preceding assignment first saves the value of x, then sets x to its value plus 1.
So, at the expression above we have first the variable x which is equal to 1.Then the x++ which returns 1. After that the value of x will be 2. So, --x = 2-1, and after that, --x
sets the value of the variable  x = 1
So the final expression is: 
-x + x++ - --x + x
-1 + 1 - (2-1) + 1 = 0   */



public class ResultOfExpressionX { 


public static void result(){
int x = 1;
System.out.println("The result of the expression -x + x++ - --x + x is: " + (-x + x++ - --x + x));
}						

public static void main(String [] args){

result();
}
}


