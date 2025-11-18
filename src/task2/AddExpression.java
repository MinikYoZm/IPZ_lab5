package task2;

/**
 * Клас NonTerminalExpression (Нетермінальний вираз). Представляє операцію додавання
 */
public class AddExpression implements Expression {
    private final Expression leftExpression;
    private final Expression rightExpression;

    public AddExpression(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public double interpret(Context context) {
        System.out.println("Метод interpret для AddExpression");
        return leftExpression.interpret(context) + rightExpression.interpret(context);
    }
}