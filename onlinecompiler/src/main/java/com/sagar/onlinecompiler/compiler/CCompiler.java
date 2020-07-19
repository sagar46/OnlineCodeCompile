package com.sagar.onlinecompiler.compiler;

import org.springframework.stereotype.Service;

@Service
public class CCompiler extends AbstractCompiler {

    private String MAIN_C = "main.c";
    private String EXECUTABLE = "a.out";
    private String COMPILE_COMMAND = "gcc " + MAIN_C;
    private String RUN_COMMAND = "./" + EXECUTABLE + " ";

    @Override
    public void createFile(String script) {
        Utility.createFile(script, MAIN_C);
    }

    @Override
    public String compile() {
        try {
            Utility.runCommand(COMPILE_COMMAND);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return " ";
    }

    @Override
    public String run(String[] args) {
        try {
            String allArgs = Utility.getArguments(args);
            return Utility.runCommand(RUN_COMMAND + allArgs);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void deleteFile() {
        Utility.deleteFile(MAIN_C);
        Utility.deleteFile(EXECUTABLE);
    }
}
