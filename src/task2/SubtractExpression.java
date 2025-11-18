package task2;

/**
 * Клас NonTerminalExpression (Нетермінальний вираз)
 * <p>
 * Представляє операцію віднімання
 */
public class SubtractExpression implements Expression {
    private final Expression leftExpression;
    private final Expression rightExpression;

    public SubtractExpression(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public double interpret(Context context) {
        System.out.println("Метод interpret для SubtractExpression");
        return leftExpression.interpret(context) - rightExpression.interpret(context);
    }
}