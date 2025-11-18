package task1;

/**
 * Клас ConcreteVisitor (Конкретний відвідувач)
 * <p>
 * Реалізує операцію підрахунку загальної суми зарплат всіх викладачів
 */
public class SalaryCalculatorVisitor implements UniversityVisitor {
    private int totalSalary = 0;

    @Override
    public void visit(Teacher teacher) {
        totalSalary += teacher.getSalary();
        System.out.println("Метод visit з параметрами teacher=" + teacher.getName());
    }

    @Override
    public void visit(Student student) {
        System.out.println("Метод visit з параметрами student=" + student.getName());
    }

    @Override
    public void visit(Department department) {
        System.out.println("Метод visit з параметрами department=" + department.getName());
    }

    @Override
    public void visit(University university) {
        System.out.println("Метод visit з параметрами university=" + university.getName());
    }

    public double getTotalSalary() {
        return totalSalary;
    }
}