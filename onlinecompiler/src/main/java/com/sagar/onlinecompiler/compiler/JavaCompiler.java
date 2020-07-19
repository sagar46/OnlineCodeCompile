package com.sagar.onlinecompiler.compiler;

import org.springframework.stereotype.Service;

@Service
public class JavaCompiler extends AbstractCompiler {

    private String MAIN_JAVA = "Main.java";
    private String MAIN_CLASS = MAIN_JAVA.split("\\.")[0];
    private String COMPILE_COMMAND = "javac "+MAIN_JAVA;
    private String RUN_COMMAND = "java " + MAIN_CLASS;

    @Override
    public void createFile(String script) {
        Utility.createFile(script, MAIN_JAVA);
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
       Utility.deleteFile(MAIN_JAVA);
       Utility.deleteFile(MAIN_CLASS + ".class");
    }

}
