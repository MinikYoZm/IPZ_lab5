package task2;

/**
 * Клас TerminalExpression (Термінальний вираз)
 * <p>
 * Представляє змінну
 */
public class VariableExpression implements Expression {
    private final String name;

    public VariableExpression(String name) {
        this.name = name;
    }

    /**
     * @return Значення змінної
     */
    @Override
    public double interpret(Context context) {
        System.out.println("Метод interpret для VariableExpression з параметрами name=" + name);
        return context.getVariable(name);
    }
}