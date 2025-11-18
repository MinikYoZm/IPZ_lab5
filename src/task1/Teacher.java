package task1;

/**
 * Клас ConcreteElement (Конкретний елемент)
 * <p>
 * Представляє викладача
 */
public class Teacher implements UniversityElement {
    private final String name;
    private final double salary;

    public Teacher(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public void accept(UniversityVisitor visitor) {
        visitor.visit(this);
    }
}