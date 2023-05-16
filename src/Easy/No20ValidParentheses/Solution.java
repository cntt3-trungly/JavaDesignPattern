package Easy.No20ValidParentheses;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack  = new Stack<>();
        if(s.length()%2 !=0)
            return false;
        for(int i=0; i<s.length();i++) {
            if ( s.charAt(i) == ')' || s.charAt(i)==']' || s.charAt(i)=='}'){
                char c = ')';
                if(s.charAt(i) == ')') c='(';
                if(s.charAt(i) == ']') c='[';
                if(s.charAt(i) == '}') c='{';
                if(stack.isEmpty() || stack.pop() != c) return false;
            }
            else stack.push(s.charAt(i));
        }
        return stack.isEmpty();
    }
}
