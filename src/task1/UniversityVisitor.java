package task1;

/**
 * Інтерфейс Visitor (Відвідувач)
 * <p>
 * Оголошує набір методів visit(), по одному для кожного ConcreteElement
 */
public interface UniversityVisitor {
    void visit(Student student);
    void visit(Teacher teacher);
    void visit(Department department);
    void visit(University university);
}