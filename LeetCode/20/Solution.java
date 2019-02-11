/* Leet code 20 Valid Parenthesis
    Vishal
    02/11/2019 */
import java.util.*;
class Solution{
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();++i){
            char t=s.charAt(i);
            // if the current char is a opening bracket, push it to stack
            if(t=='(' || t=='[' || t=='{')
                stack.push(t);
            else{
                // check if stack is empty
                // after that check if top is corresponding opening bracket of current char i.e. closing bracket
                if(!stack.empty() && ((t==')' && stack.peek()=='(') ||(t=='}' && stack.peek()=='{') || (t==']' && stack.peek()=='[')))
                    stack.pop();
                else
                // top and current char condition failed.
                    return false;
            }
        }
        // there is no unmatched bracket left in the stack
        return stack.empty();   
    }
}