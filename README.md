# UnitTesting 
This repository contains my notes on Unit testing with Junit, Mockito and PowerMock.

**Difference between mockito-core vs mockito-inline :**
> mockito-core allows us to create mock objects. Since static methods belong to the class, there is no way to mock static methods using mockito-core. 
> But we can now mock static method in 3 ways : 
1. mockito-inline (better way) - See how : https://www.testim.io/blog/mocking-static-methods-mockito/
2. creating wrapper object ( next good one) - See how : https://www.testim.io/blog/mocking-static-methods-mockito/
3. third-party package called PowerMock. (need to learn another tool/dependency.Not good) 

> mockito-inline has features like mocking final classes and methods, mocking static methods etc. 

**Difference between mockito-core and mockito-all:**
> mockito-core only contains mockito classes, while mockito-all contain mockito classes as well as some dependencies, one of them being hamcrest.
> But mockito-all is discontinued according to the mockito website : “mockito-all” distribution has been discontinued in Mockito 2.*.


**Useful links to learn and revise again can be found below :**
> 1. Good place to read about Mockito - https://javadoc.io/doc/org.mockito/mockito-core/2.23.0/org/mockito/Mockito.html
