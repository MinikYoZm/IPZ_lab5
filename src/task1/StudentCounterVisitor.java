package task1;

/**
 * Клас ConcreteVisitor (Конкретний відвідувач)
 * <p>
 * Реалізує операцію підрахунку студентів в університеті
 */
public class StudentCounterVisitor implements UniversityVisitor {
    private int studentCount = 0;

    @Override
    public void visit(Student student) {
        studentCount++;
        System.out.println("Метод visit з параметрами student=" + student.getName());
    }

    @Override
    public void visit(Teacher teacher) {
        System.out.println("Метод visit з параметрами teacher=" + teacher.getName());
    }

    @Override
    public void visit(Department department) {
        System.out.println("Метод visit з параметрами department=" + department.getName());
    }

    @Override
    public void visit(University university) {
        System.out.println("Метод visit з параметрами university=" + university.getName());
    }

    public int getStudentCount() {
        return studentCount;
    }
}