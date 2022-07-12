package Mockito.Mock;

import Mockito.Step2.ToDo.ToDoBusinessImpl;
import Mockito.Step2.ToDo.ToDoService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;

// Mockito annotations

@RunWith(MockitoJUnitRunner.class) //Needed when using mockito annotations
public class MockitoTest_Step10 {
    //We will take a unit test we wrote previously and modify it to use Mockito Annotations.
    // We will take ToDoServiceMockTest.java

    /* --- Step 11 :  A rule can also be used instead of a MockitoJUnitRunner at line 19.
    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();
    */

    @Mock
    ToDoService toDoServiceMock;

    @InjectMocks // This will create instance of ToDoBusinessImpl and pass required mocked input parameters to it automatically
    ToDoBusinessImpl toDoBusinessImp;

    /*
    For @Captor annotation example see MockitoTest_ArgumentCapture_Step8.java test
     */

    @Test
    public void testRetrieveTodosRelatedToSpring_UsingMock() {
        //ToDoService toDoServiceMock = mock(ToDoService.class); --> Eliminated due to line 29.
        List<String> todos = Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to Dance");
        when(toDoServiceMock.retrieveTodos("Supriti")).thenReturn(todos);

       //ToDoBusinessImpl toDoBusinessImp = new ToDoBusinessImpl(toDoServiceMock); --> Eliminated due to line 32.

        List<String> filteredToDo = toDoBusinessImp.retrieveTodosRelatedToSpring("Supriti");
        Assert.assertEquals("Testing mock asserts work", 2, filteredToDo.size());
    }

    @Test
    public void testRetrieveEmptyTodosList_UsingMock() {
       // ToDoService toDoServiceMock = mock(ToDoService.class); --> Eliminated due to line 29.
        List<String> todos = Arrays.asList();
        when(toDoServiceMock.retrieveTodos("Supriti")).thenReturn(todos);

        //ToDoBusinessImpl toDoBusinessImp = new ToDoBusinessImpl(toDoServiceMock); --> Eliminated due to line 32.

        List<String> filteredToDo = toDoBusinessImp.retrieveTodosRelatedToSpring("Supriti");
        Assert.assertEquals("Testing mock asserts work", 0, filteredToDo.size());
    }


}

/*
Notes :
1. Mockito Annotations
@Mock
@InjectMocks
@RunWith(MockitoJUnitRunner.class)
@Captor


 */