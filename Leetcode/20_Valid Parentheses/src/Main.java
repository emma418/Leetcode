import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //[([]]) false
        //(([]){}) true
        //([)] false
        //(){}}{ false
        //{[]} true
        //(){}[]
        System.out.println(isValid("[([]])"));//[([]])


    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        if(s.length() % 2 != 0){
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if(c == '(') {
                stack.push(')');
            } else if(c == '{') {
                stack.push('}');
            } else if(c == '[') {
                stack.push(']');
            } else if (stack.empty() || c != stack.peek()) {
                return false;
            } else {
                stack.pop();
            }
        }
        if (stack.empty()) {
            return true;
        }
        return false;

    }

}
