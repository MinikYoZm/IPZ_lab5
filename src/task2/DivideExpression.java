package task2;

/**
 * Клас NonTerminalExpression (Нетермінальний вираз)
 * <p>
 * Представляє операцію ділення
 */
public class DivideExpression implements Expression {
    private final Expression leftExpression;
    private final Expression rightExpression;

    public DivideExpression(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public double interpret(Context context) {
        System.out.println("Метод interpret для DivideExpression");
        double right = rightExpression.interpret(context);
        if (right == 0) {
            throw new ArithmeticException("Ділення на нуль.");
        }
        return leftExpression.interpret(context) / right;
    }
}