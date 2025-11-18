package task1;

/**
 * Клас ConcreteElement (Конкретний елемент)
 * <p>
 * Представляє студента
 */
public class Student implements UniversityElement {
    private final String name;
    private final int studentId;

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public void accept(UniversityVisitor visitor) {
        visitor.visit(this);
    }
}