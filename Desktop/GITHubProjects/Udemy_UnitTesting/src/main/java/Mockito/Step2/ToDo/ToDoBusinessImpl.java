package Mockito.Step2.ToDo;

import java.util.ArrayList;
import java.util.List;

public class ToDoBusinessImpl {

    // ToDoService is an External dependency.
    // How do I test 'ToDoBusinessImpl' without having the implementation for 'ToDoService'- Enters Mocking!
    private ToDoService toDoService;

    public ToDoBusinessImpl(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    public List<String> retrieveTodosRelatedToSpring(String user) {
        List<String> filteredTodos = new ArrayList<>();
        List<String> allTodos = toDoService.retrieveTodos(user);
        for (String todo : allTodos) {
            if (todo.contains("Spring")) {
                filteredTodos.add(todo);
            }
        }
        return filteredTodos;
    }

    public void deleteTodosNotRelatedToSpring(String user) {
        List<String> allTodos = toDoService.retrieveTodos(user);
        for (String todo : allTodos) {
            if (!todo.contains("Spring")) {
                toDoService.deleteTodo(todo);
            }
        }
    }

}
