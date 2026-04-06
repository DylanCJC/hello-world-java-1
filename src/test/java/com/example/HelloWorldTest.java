package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class HelloWorldTest {
    @Test
    public void testGetGreeting() {
        HelloWorld helloWorld = new HelloWorld();
        assertEquals("Hello, Student!", helloWorld.getGreeting());
    }
}
