package Mockito.Mock;

import Mockito.Step2.ToDo.ToDoBusinessImpl;
import Mockito.Step2.ToDo.ToDoService;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.mockito.BDDMockito.*;
import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Mockito.mock;

public class MockitoTest_BDD_Step6 {
/*BDD - Behavior driven development
In BDD we start splitting a given user story into Given-When-Then format.

In Unit testing too we do similar stuffs :
Given - we setup
When - here we do actual method calls
Then - we do Asserts
 */
    //Lets use BDD for below test
    @Test
    public void testRetrieveEmptyTodosList_UsingBDDMock() {
        //Given
        ToDoService toDoServiceMock = mock(ToDoService.class);
        List<String> todos = Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to Dance");
        //when(toDoServiceMock.retrieveTodos("Supriti")).thenReturn(todos);
        given(toDoServiceMock.retrieveTodos("Supriti")).willReturn(todos); //Special BDD step
        ToDoBusinessImpl toDoBusinessImp = new ToDoBusinessImpl(toDoServiceMock);

        //When
        List<String> filteredToDo = toDoBusinessImp.retrieveTodosRelatedToSpring("Supriti");

        //Then
        Assert.assertThat(filteredToDo.size(),is(2)); //Special BDD step
        //Assert.assertEquals("Testing mock asserts work", 2, filteredToDo.size());
    }



}
