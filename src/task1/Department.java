package task1;

import java.util.ArrayList;
import java.util.List;

/**
 * Клас ConcreteElement (конкретний елемент)
 * <p>
 * Представляє кафедру в моєму варіанті факульет, яка може містити в собі інші елементи
 */
public class Department implements UniversityElement {
    private final String name;
    private final List<UniversityElement> children = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addElement(UniversityElement element) {
        children.add(element);
        System.out.println("Метод addElement з параметрами element=" + element.getClass().getSimpleName());
    }

    @Override
    public void accept(UniversityVisitor visitor) {
        visitor.visit(this);
        for (UniversityElement child : children) {
            child.accept(visitor);
        }
    }
}