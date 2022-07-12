package Mockito.Mock;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

//Mockito Spy
public class MockitoTest_Step13 {

    @Test
    public void test() {
        List arrayListSpy = spy(ArrayList.class);
        stub(arrayListSpy.size()).toReturn(5);
        assertEquals(5, arrayListSpy.size());

        arrayListSpy.add("Dummy");
        verify(arrayListSpy).add("Dummy"); //here it checks if add() was called
        verify(arrayListSpy,never()).clear(); // here it checks that clear() was never called.

    }


}

/*
Difference  between Mock and Spy :
1. A mock does not care about the actual implemented logic of the mocked class.
And a mock alway returns default values when a method is not stubbed.

2. A Spy gets all the logic from the class it's spying. With a Spy you can stub specific
methods of your choice and the rest of the methods retain actual implementation.Its like a partial Mock.

 */