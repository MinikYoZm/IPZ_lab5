package task2;

/**
 * Клас TerminalExpression (Термінальний вираз)
 * <p>
 * Представляє число
 */
public class NumberExpression implements Expression {
    private final double number;

    public NumberExpression(double number) {
        this.number = number;
    }

    @Override
    public double interpret(Context context) {
        System.out.println("Метод interpret для NumberExpression з параметрами number=" + number);
        return number;
    }
}