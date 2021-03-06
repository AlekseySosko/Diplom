package ru.netology.javacore;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TodosTests {
    private static Todos todos;
    private static String task;

    @BeforeEach
    public void createList() {
        todos = new Todos();
        task = "Пробежка";
        todos.getTodos().add(task);
    }

    @Test
    public void addTaskShouldReturnTrue() {
        String test = "test";
        todos.getTodos().add(test);
        boolean result = todos.getTodos().contains(test);

        Assertions.assertTrue(result);
    }

    @Test
    public void removeShouldReturnFalse() {
        todos.getTodos().remove(task);
        boolean result = todos.getTodos().contains(task);

        Assertions.assertFalse(result);
    }

    @Test
    public void getAllTaskShouldReturnSortedTaskBar() {
        String sortedTaskBar = "Акробатика Пробежка Учеба";
        todos.getTodos().add("Учеба");
        todos.getTodos().add("Акробатика");
        String result = todos.getAllTasks();

        Assertions.assertTrue(sortedTaskBar.contains(result));
    }
}
