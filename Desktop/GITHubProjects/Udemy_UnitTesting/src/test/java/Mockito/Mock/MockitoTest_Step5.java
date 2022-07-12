package Mockito.Mock;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MockitoTest_Step5 {
    //Mocking List interface methods

    //Usecase #1
    @Test
    public void letsMockListInterface_SizeMethod() {
       List mockList = mock(List.class);
       when(mockList.size()).thenReturn(2);

        Assert.assertEquals("List size didnot match", 2, mockList.size());
    }

    //Usecase #2
    @Test
    public void letsMockListInterface_SizeMethod_ReturnMultipleValues() {
        List mockList = mock(List.class);
        when(mockList.size()).thenReturn(2).thenReturn(3).thenReturn(5);

        Assert.assertEquals("List size didnot match", 2, mockList.size());
        Assert.assertEquals("List size didnot match", 3, mockList.size());
        Assert.assertEquals("List size didnot match", 5, mockList.size());
    }

    //Usecase #3 : Nice mock feature - Returns default value when requested value is not mocked.
    @Test
    public void letsMockListInterface_GetMethod_NiceMockFeature() {
        List mockList = mock(List.class);
        when(mockList.get(0)).thenReturn("Testing size");

        Assert.assertEquals("List get value did not match", "Testing size", mockList.get(0));
        Assert.assertEquals("List get value did not match", null, mockList.get(1));
    }

    //Usecase #4 : Argument matcher (Note that while method stubbing we cannot pass an argument matcher and a hardcoded value together)
    @Test
    public void letsMockListInterface_GetMethod_ArgumentMatcherFeature() {
        List mockList = mock(List.class);
        when(mockList.get(anyInt())).thenReturn("Testing Argument Matcher");

        Assert.assertEquals("List get value did not match", "Testing Argument Matcher", mockList.get(0));
        Assert.assertEquals("List get value did not match", "Testing Argument Matcher", mockList.get(1));
        Assert.assertEquals("List get value did not match", "Testing Argument Matcher", mockList.get(5));
        Assert.assertEquals("List get value did not match", "Testing Argument Matcher", mockList.get(3));
    }

    //Usecase #5 : throws Exception
    @Test(expected = RuntimeException.class)
    public void letsMockListInterface_ThrowsException() {
        List mockList = mock(List.class);
        when(mockList.get(anyInt())).thenThrow(new RuntimeException("Exception thrown"));

        mockList.get(1);
    }

}
