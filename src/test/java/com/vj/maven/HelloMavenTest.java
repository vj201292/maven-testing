package com.vj.maven;

import org.junit.Test;

import static org.junit.Assert.*;

public class HelloMavenTest {

    @Test
    public void getHello() {
        HelloMaven helloMaven = new HelloMaven();
        assertEquals("Hello World",helloMaven.getHello());
    }
}