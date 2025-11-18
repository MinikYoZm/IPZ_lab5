package task2;

/**
 * Інтерфейс AbstractExpression (Абстрактний вираз)
 * <p>
 * Оголошує загальний метод interpret()
 */
public interface Expression {
    /**
     * Обчислює (інтерпретує) вираз, використовуючи дані з контексту
     */
    double interpret(Context context);
}