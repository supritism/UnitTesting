package PowerMock.Step15;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.when;

@RunWith(PowerMockRunner.class) //Runner for PowerMock
@PrepareForTest({ UtilityClass.class}) //Used for Static methods being mocked
public class MockingStaticMethodTest {

    @Mock
    Dependency dependencyMock;

    @InjectMocks
    SystemUnderTest systemUnderTest;

    @Test
    public void powerMockito_MockingAStaticMethodCall() {
        when(dependencyMock.retrieveAllStats()).thenReturn(
                Arrays.asList(1, 2, 3));

        PowerMockito.mockStatic(UtilityClass.class); //Before mocking every static method we need to declare it.
        when(UtilityClass.staticMethod(anyLong())).thenReturn(150);

        assertEquals(150, systemUnderTest.methodCallingAStaticMethod());

        //To verify a specific method call
        //First : Call PowerMockito.verifyStatic()
        //Second : Call the method to be verified
        PowerMockito.verifyStatic();
        UtilityClass.staticMethod(1 + 2 + 3);

    }
}
