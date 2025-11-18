package task2;

/**
 * Клас NonTerminalExpression (Нетермінальний вираз)
 * <p>
 * Представляє операцію множення
 */
public class MultiplyExpression implements Expression {
    private final Expression leftExpression;
    private final Expression rightExpression;

    public MultiplyExpression(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public double interpret(Context context) {
        System.out.println("Метод interpret для MultiplyExpression");
        return leftExpression.interpret(context) * rightExpression.interpret(context);
    }
}