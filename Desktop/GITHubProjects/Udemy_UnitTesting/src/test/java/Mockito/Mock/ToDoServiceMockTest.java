package Mockito.Mock;

import Mockito.Step2.ToDo.ToDoBusinessImpl;
import Mockito.Step2.ToDo.ToDoService;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ToDoServiceMockTest {

    @Test
    public void testRetrieveTodosRelatedToSpring_UsingMock() {
        //mock() creates mock object of a given class or interface
        ToDoService toDoServiceMock = mock(ToDoService.class);
        List<String> todos = Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to Dance");
        when(toDoServiceMock.retrieveTodos("Supriti")).thenReturn(todos);

        ToDoBusinessImpl toDoBusinessImp = new ToDoBusinessImpl(toDoServiceMock);

        List<String> filteredToDo = toDoBusinessImp.retrieveTodosRelatedToSpring("Supriti");
        Assert.assertEquals("Testing mock asserts work", 2, filteredToDo.size());
    }

    @Test
    public void testRetrieveEmptyTodosList_UsingMock() {
        //mock() creates mock object of a given class or interface
        ToDoService toDoServiceMock = mock(ToDoService.class);
        List<String> todos = Arrays.asList();
        when(toDoServiceMock.retrieveTodos("Supriti")).thenReturn(todos);

        ToDoBusinessImpl toDoBusinessImp = new ToDoBusinessImpl(toDoServiceMock);

        List<String> filteredToDo = toDoBusinessImp.retrieveTodosRelatedToSpring("Supriti");
        Assert.assertEquals("Testing mock asserts work", 0, filteredToDo.size());
    }
}
