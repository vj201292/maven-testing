package com.vj.maven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloMavenTest {

    @Test
    void getHello() {
        assertEquals("Hello World",new HelloMaven().getHello());
    }
}