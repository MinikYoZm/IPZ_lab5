package task2;

/**
 * Клієнтський клас (Client)
 */
public class Main {

    public static void main(String[] args) {
        //значення змінних.
        Context context = new Context();
        context.setVariable("x", 10.0);
        context.setVariable("y", 2.0);


        //(x - 4)
        Expression subExpr = new SubtractExpression(
                new VariableExpression("x"),
                new NumberExpression(4)
        );

        // 3 + 5 * 2
        Expression mulExpr = new MultiplyExpression(
                new NumberExpression(5),
                new NumberExpression(2)
        );
        Expression addExpr = new AddExpression(
                new NumberExpression(3),
                mulExpr
        );

        //(x - 4) / y
        Expression divExpr = new DivideExpression(
                subExpr,
                new VariableExpression("y")
        );

        // (3 + 5 * 2) - ((x - 4) / y)
        Expression finalExpression = new SubtractExpression(
                addExpr,
                divExpr
        );

        System.out.println("\n====Обчислення виразу: 3 + 5 * 2 - (x - 4) / y====");

        //метод interpret().
        double result = finalExpression.interpret(context);

        System.out.println("\nРезультат: " + result);
    }
}