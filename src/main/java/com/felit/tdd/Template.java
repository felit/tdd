package com.felit.tdd;

/**
 *
 */
public class Template {
    private String variableName;

    public Template(String templateText) {

    }

    public void set(String var, String val) {
        this.variableName = val;

    }

    public String evaluate() {
        return "Hello, " + this.variableName;
    }
}
