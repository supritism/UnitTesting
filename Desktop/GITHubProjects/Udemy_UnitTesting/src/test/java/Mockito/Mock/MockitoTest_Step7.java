package Mockito.Mock;

import Mockito.Step2.ToDo.ToDoBusinessImpl;
import Mockito.Step2.ToDo.ToDoService;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.*;

//Verify calls on Mocks
public class MockitoTest_Step7 {

    @Test
    public void testDeleteTodosRelatedToSpring_VerifyMethodCalls() {
        //Given
        ToDoService toDoServiceMock = mock(ToDoService.class);
        List<String> todos = Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to Dance");
        given(toDoServiceMock.retrieveTodos("Supriti")).willReturn(todos);
        ToDoBusinessImpl toDoBusinessImp = new ToDoBusinessImpl(toDoServiceMock);

        //When
        toDoBusinessImp.deleteTodosNotRelatedToSpring("Supriti");

        //Then
        verify(toDoServiceMock).deleteTodo("Learn to Dance");//This verifies method deleteTodo() is called with given parameter.
        verify(toDoServiceMock, never()).deleteTodo("Learn Spring"); //This verifies method deleteTodo() is never called with given parameter.
        verify(toDoServiceMock, atLeast(1)).deleteTodo("Learn to Dance"); //This verifies method deleteTodo() is called atleast once with given parameter.
        //Or (another clearer option when using 'Then' in BDD)
        then(toDoServiceMock).should().deleteTodo("Learn to Dance");
        then(toDoServiceMock).should(never()).deleteTodo("Learn Spring");
        then(toDoServiceMock).should(atLeast(1)).deleteTodo("Learn to Dance");
    }
}
