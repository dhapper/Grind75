package easy;
import java.util.Stack;

public class ValidParenthesis {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        boolean continueLoop = true;
        for (int i = s.length(); i > 0; i--) {
            char lastChar = s.charAt(i - 1);
            if (lastChar == ')' || lastChar == ']' || lastChar == '}') {
                stack.push(lastChar);
                System.out.println(lastChar);
            }else {
                if(stack.isEmpty()) return false;
                switch (lastChar) {
                    case '(':
                        continueLoop = checkStack(stack, ')');
                        break;
                    case '{':
                        continueLoop = checkStack(stack, '}');
                        break;
                    case '[':
                        continueLoop = checkStack(stack, ']');
                        break;
                }
            }
            if (!continueLoop)  return false;
        }

        return stack.isEmpty() ? true : false;
    }

    public boolean checkStack(Stack<Character> stack, char close) {
        if (stack.peek() == close) {
            stack.pop();
            return true;
        } else
            return false;
    }
}
