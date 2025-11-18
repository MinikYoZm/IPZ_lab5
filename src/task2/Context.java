package task2;

import java.util.HashMap;
import java.util.Map;

/**
 * Клас Context (Контекст)
 * <p>
 * Зберігає глобальну інформацію, яка використовується інтерпретатором під час
 * обчислення виразу, містить мапу імен змінних та їх числових значень
 */
public class Context {
    private final Map<String, Double> variables = new HashMap<>();

    /**
     * Встановлює значення для змінної
     * @param name  Ім'я змінної
     * @param value Значення змінної
     */
    public void setVariable(String name, Double value) {
        System.out.println("Метод setVariable з параметрами name=" + name + ", value=" + value);
        variables.put(name, value);
    }

    /**
     * Отримує значення змінної за її ім'ям
     * @param name Ім'я змінної
     * @return Значення змінної
     * @throws IllegalArgumentException якщо змінна не знайдена
     */
    public Double getVariable(String name) {
        if (!variables.containsKey(name)) {
            throw new IllegalArgumentException("Змінна не знайдена: " + name);
        }
        return variables.get(name);
    }
}