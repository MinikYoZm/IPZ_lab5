package task1;

/**
 * Клієнтський клас (Client)
 */
public class Main {
    public static void main(String[] args) {
        // 1. Створення ієрархічної структури університету
        System.out.println("====Створення структури університету====");
        University university = new University("КПІ");

        Department FIOT = new Department("ФІОТ");
        Department FPM = new Department("ФПМ");

        FIOT.addElement(new Teacher("Мазур В.О.", 55000));
        FIOT.addElement(new Teacher("Середа І.М.", 42000));
        FIOT.addElement(new Student("Клюйко В.М.", 101));
        FIOT.addElement(new Student("Сидоренко М.Л.", 102));

        FPM.addElement(new Teacher("Кутузов В.К.", 62000));
        FPM.addElement(new Student("Яйко В.Ж.", 201));

        university.addElement(FIOT);
        university.addElement(FPM);
        System.out.println("\n====Структура створена====\n");

        // 2. Виконання операції підрахунку студентів
        System.out.println("====Операція 1: Підрахунок кількості студентів====");
        StudentCounterVisitor studentCounter = new StudentCounterVisitor();
        university.accept(studentCounter);
        System.out.println("Загальна кількість студентів в університеті: " + studentCounter.getStudentCount());
        System.out.println();

        // 3. Можливість додати нову операцію: виведення структури
        System.out.println("====Операція 2: Відображення структури====");
        StructureDisplayVisitor structureDisplay = new StructureDisplayVisitor();
        university.accept(structureDisplay);
        System.out.println();

        // 4. Можливість додати ще одну операцію: підрахунок зарплати
        System.out.println("====Операція 3: Підрахунок загальної зарплати викладачів====");
        SalaryCalculatorVisitor salaryCalculator = new SalaryCalculatorVisitor();
        university.accept(salaryCalculator);
        System.out.println("Загальна сума зарплат викладачів: " + salaryCalculator.getTotalSalary());
    }
}