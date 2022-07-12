package Mockito.Mock;

import Mockito.Step2.ToDo.ToDoBusinessImpl;
import Mockito.Step2.ToDo.ToDoService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.mock;

//Capturing arguments passed to a mock method
@RunWith(MockitoJUnitRunner.class) //Needed when using mockito annotations
public class MockitoTest_ArgumentCapture_Step8 {

    @Captor
    ArgumentCaptor<String> argumentCaptor;

    @Test
    public void testDeleteTodosRelatedToSpring_VerifyMethodCalls() {

        //ArgumentCaptor<String> argumentCaptor = ArgumentCaptor.forClass(String.class); --> modified due to line 22 (mockito annotations)

        //Given
        ToDoService toDoServiceMock = mock(ToDoService.class);
        List<String> todos = Arrays.asList("Learn Spring MVC", "Learn rock and roll", "Learn to Dance");
        given(toDoServiceMock.retrieveTodos("Supriti")).willReturn(todos);
        ToDoBusinessImpl toDoBusinessImp = new ToDoBusinessImpl(toDoServiceMock);

        //When
        toDoBusinessImp.deleteTodosNotRelatedToSpring("Supriti");

        //Then
        then(toDoServiceMock).should().deleteTodo(argumentCaptor.capture()); //here we are using ArgumentCaptor to capture all parameters value.
        //Assert.assertThat(argumentCaptor.getValue(), is("Learn to Dance"));
        Assert.assertThat(argumentCaptor.getAllValues().size(), is(2)); //As there are 2 values in 'todos' without 'Spring'.
    }


}
