package com.sagar.onlinecompiler.controller;

public class Input {
    String script;
    String[] stdin;

    public Input() {
    }

    public Input(String script, String[] stdin) {
        this.script = script;
        this.stdin = stdin;
    }

    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script;
    }

    public String[] getStdin() {
        return stdin;
    }

    public void setStdin(String[] stdin) {
        this.stdin = stdin;
    }
}
