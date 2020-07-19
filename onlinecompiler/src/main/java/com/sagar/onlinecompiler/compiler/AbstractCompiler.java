package com.sagar.onlinecompiler.compiler;

import com.sagar.onlinecompiler.controller.Input;

public abstract class  AbstractCompiler implements Compiler {

    public String execute(Input input) {
        this.createFile(input.getScript());
        String output = this.compile();
      output = output + this.run(input.getStdin());
        this.deleteFile();
        return output;
    }

}
