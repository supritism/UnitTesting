package PowerMock.Step15;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.reflect.Whitebox;

import java.util.Arrays;

import static org.mockito.Mockito.when;

@RunWith(PowerMockRunner.class) //Runner for PowerMock
public class MockingPrivateMethodTest {

    @Mock
    Dependency dependencyMock;

    @InjectMocks
    SystemUnderTest systemUnderTest;

    @Test
    public void powerMockito_CallingAPrivateMethod() throws Exception {
        when(dependencyMock.retrieveAllStats()).thenReturn(
                Arrays.asList(1, 2, 3));
        long value = Whitebox.invokeMethod(systemUnderTest,
                "privateMethodUnderTest");
        Assert.assertEquals(6, value);
    }
}
