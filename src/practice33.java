import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class practice33 {
    public static String solveExpression(String expression) {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");

        try {
            Object result = engine.eval(expression);
            return result.toString();
        } catch (ScriptException e) {
            return "Invalid expression";
        }
    }

    public static void main(String[] args) {
        String expression = "4.5/4+7*9+4";
        String result = solveExpression(expression);
        System.out.println(result);
    }

}
