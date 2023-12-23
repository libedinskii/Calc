import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите выражение: ");
        String expression = scanner.nextLine();

        double result = calculate(expression);
        System.out.println("Результат: " + result);
    }

    public static double calculate(String expression) {
        String[] tokens = expression.split("\\s+"); // Используем регулярное выражение для разделения по любому количеству пробелов

        double operand1 = Double.parseDouble(tokens[0]);
        String operator = tokens[1];
        double operand2 = Double.parseDouble(tokens[2]);

        double result = 0;

        switch (operator) {
            case "+":
                result = operand1 + operand2;
                break;
            case "-":
                result = operand1 - operand2;
                break;
            case "*":
                result = operand1 * operand2;
                break;
            case "/":
                result = operand1 / operand2;
                break;
            default:
                System.out.println("Неподдерживаемый оператор");
        }

        return result;
    }
}
