package com.vj.maven;

public class HelloMavenTest {

    public void testGetHello(){
        HelloMaven helloMaven = new HelloMaven();
        assert("Hello World".equals(helloMaven.getHello()));
    }

}