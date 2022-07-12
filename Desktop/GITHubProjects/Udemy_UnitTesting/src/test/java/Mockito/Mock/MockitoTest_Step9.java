package Mockito.Mock;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

//Hamcrest matchers example
public class MockitoTest_Step9 {

    @Test
    public void test() {
        List<Integer> scores = Arrays.asList(10, 33, 98 );

        assertThat(scores, hasItems(33,98));
        assertThat(scores, hasSize(3));
        assertThat(scores, everyItem(greaterThan(5)));
        assertThat(scores, everyItem(lessThan(100)));

        // String
        assertThat("", isEmptyString());
        assertThat(null, isEmptyOrNullString());

        //Arrays
        Integer[] marks = {1, 2, 3};
        assertThat(marks, arrayWithSize(3));
        assertThat(marks, hasItemInArray(3));
        assertThat(marks, arrayContainingInAnyOrder(3,2,1));

    }

}

/*
Notes :
Pre-req : Make sure to add the 'hamcrest-library' to pom.xml dependencies to start using hamcrest matchers.

1. Hamcrest Matchers - Help us to write Asserts in a readable way and result in very maintainable application.

Example of asserts with Hamcrest matchers are :
        assertThat(scores, hasSize(4));
        assertThat(scores, hasItems(100, 101));
        assertThat(scores, everyItem(greaterThan(90)));
        assertThat(scores, everyItem(lessThan(200)));

        // String
        assertThat("", isEmptyString());
        assertThat(null, isEmptyOrNullString());

 As seen from example above Hamcrest matchers bring in such syntax which makes our code very readable.
 Clarity and simplicity of code is very important.

To see all the methods present in Matchers open Matchers() class from imports and refer.

 */