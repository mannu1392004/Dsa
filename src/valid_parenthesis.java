import java.util.Stack;

public class valid_parenthesis {
    public static void main(String[] args){
        System.out.println(isValid("()]"));
    }
    public static   boolean isValid(String s) {
        Stack<Character> parenthesis = new Stack<>();
        for (int i = 0;i<s.length();i++){
            if (s.charAt(i)=='}'||s.charAt(i)==']'||s.charAt(i)==')'&&!parenthesis.isEmpty()){
        char x =  parenthesis.peek();
             System.out.println(x);
        if (s.charAt(i)=='}'&&x=='{'){
            parenthesis.pop();
        }

        if (s.charAt(i)==']'&& x=='['){
            parenthesis.pop();
        }

        if (s.charAt(i)==')'&& x=='('){
            parenthesis.pop();
        }

          }
          else {
              parenthesis.push(s.charAt(i));
          }
        }
        if (parenthesis.isEmpty()){
            return true;

        }


        return false;
    }
}
