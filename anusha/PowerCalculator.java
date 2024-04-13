package anusha;
import java.util.Map;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class PowerCalculator {

    public static double calculatePower(String expression, Map<String, Double> variables) {
        // Create a ScriptEngineManager
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");

        // Check if the engine is null
        if (engine == null) {
            System.err.println("JavaScript engine not found");
            return Double.NaN;
        }

        // Replace variables in the expression with their values
        for (Map.Entry<String, Double> entry : variables.entrySet()) {
            expression = expression.replaceAll(entry.getKey(), entry.getValue().toString());
        }

        // Evaluate the expression
        try {
            return (double) engine.eval(expression);
        } catch (ScriptException e) {
            e.printStackTrace();
            return Double.NaN;
        }
    }

    public static void main(String[] args) {
        // Test cases
        Map<String, Double> variables1 = Map.of("x", 2.0, "y", 3.0);
        System.out.println(calculatePower("x + y", variables1)); // Expected output: 5.0

        Map<String, Double> variables2 = Map.of("a", 5.0, "b", 2.0);
        System.out.println(calculatePower("a * b", variables2)); // Expected output: 10.0

        Map<String, Double> variables3 = Map.of("x", 3.0, "y", 4.0);
        System.out.println(calculatePower("x * y", variables3)); // Expected output: 12.0

        Map<String, Double> variables4 = Map.of("a", 10.0, "b", 2.0);
        System.out.println(calculatePower("a / b", variables4)); // Expected output: 5.0

        Map<String, Double> variables5 = Map.of("x", 2.0, "y", 3.0);
        System.out.println(calculatePower("x - y", variables5)); // Expected output: -1.0
    }
}
