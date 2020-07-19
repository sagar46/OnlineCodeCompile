package com.sagar.onlinecompiler.compiler;

import com.sagar.onlinecompiler.controller.Input;

public interface Compiler {
    void createFile(String script);
    String compile();
    String execute(Input input);
    String run(String[] args);
    void deleteFile();
}
