package com.sagar.onlinecompiler.controller;

import com.sagar.onlinecompiler.compiler.Compiler;
import com.sagar.onlinecompiler.compiler.CompilerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/compiler", consumes = "application/json", produces = "application/json")
public class CompilerController {

    @PostMapping(value = "/{lang}")
    public Output compile(@PathVariable("lang") Language language, @RequestBody Input input) {
        Compiler compiler = CompilerFactory.getCompiler(language);
        if (compiler != null) {
            return new Output(compiler.execute(input), "Success", "Compilation Success");
        } else {
            return new Output(null, "Failure", "Language support not found.");
        }
    }
}
