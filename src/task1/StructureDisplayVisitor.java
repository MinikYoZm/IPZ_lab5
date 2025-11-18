package task1;

/**
 * Клас ConcreteVisitor (Конкретний відвідувач)
 * <p>
 * Реалізує операцію відображення структури університету
 */
public class StructureDisplayVisitor implements UniversityVisitor {
    private int indent = 0;

    private void printWithIndent(String text) {
        for (int i = 0; i < indent; i++) {
            System.out.print("  ");
        }
        System.out.println(text);
    }

    @Override
    public void visit(Student student) {
        printWithIndent("- Студент: " + student.getName() + " (ID: " + student.getStudentId() + ")");
    }

    @Override
    public void visit(Teacher teacher) {
        printWithIndent("- Викладач: " + teacher.getName() + " (Зарплата: " + teacher.getSalary() + ")");
    }

    @Override
    public void visit(Department department) {
        printWithIndent("Кафедра: " + department.getName());
        indent++;
    }

    @Override
    public void visit(University university) {
        printWithIndent("Університет: " + university.getName());
        indent++;
    }
}