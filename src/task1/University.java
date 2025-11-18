package task1;

import java.util.ArrayList;
import java.util.List;

/**
 * Клас ObjectStructure (Структура об'єктів), а також ConcreteElement - університет
 * <p>
 * Представляє університет
 */
public class University implements UniversityElement {
    private final String name;
    private final List<UniversityElement> elements = new ArrayList<>();

    public University(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addElement(UniversityElement element) {
        elements.add(element);
        System.out.println("Метод addElement з параметрами element=" + element.getClass().getSimpleName());
    }

    @Override
    public void accept(UniversityVisitor visitor) {
        visitor.visit(this);
        for (UniversityElement element : elements) {
            element.accept(visitor);
        }
    }
}