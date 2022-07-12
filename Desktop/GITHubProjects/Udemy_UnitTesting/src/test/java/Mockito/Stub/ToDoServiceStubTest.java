package Mockito.Stub;

import Mockito.Step2.ToDo.ToDoBusinessImpl;
import Mockito.Step2.ToDo.ToDoService;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ToDoServiceStubTest {

    @Test
    public void testStub() {
        ToDoService toDoServiceStub = new ToDoServiceStub();
        ToDoBusinessImpl toDoBusinessImp = new ToDoBusinessImpl(toDoServiceStub);

        List<String> filteredToDo = toDoBusinessImp.retrieveTodosRelatedToSpring("Supriti");
        Assert.assertEquals(2, filteredToDo.size());
    }
}
