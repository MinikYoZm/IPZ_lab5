package task1;

/**
 * Інтерфейс Element (Елемент)
 */
public interface UniversityElement {
    /**
     * Метод для прийняття відвідувача
     */
    void accept(UniversityVisitor visitor);
}