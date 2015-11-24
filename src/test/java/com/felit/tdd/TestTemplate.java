package com.felit.tdd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 */
public class TestTemplate {
    @Test
    public void oneVariable() {
        Template template = new Template("Hello, ${name}");
        template.set("name", "Reader");
        assertEquals("Hello, Reader", template.evaluate());
    }

    @Test
    public void differentValue() {
        Template template = new Template("Hi, ${name}");
        template.set("name", "something else");
        assertEquals("Hi, something else", template.evaluate());
    }
}
