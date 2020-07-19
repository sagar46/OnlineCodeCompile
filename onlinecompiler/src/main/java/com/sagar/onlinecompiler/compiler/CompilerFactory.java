package com.sagar.onlinecompiler.compiler;

import com.sagar.onlinecompiler.controller.Language;
import org.springframework.stereotype.Service;

import static com.sagar.onlinecompiler.controller.Language.C;
import static com.sagar.onlinecompiler.controller.Language.JAVA;

@Service
public class CompilerFactory {

    public static Compiler getCompiler(Language lang) {
        if (JAVA.equals(lang)) {
            return new JavaCompiler();
        } else if (C.equals(lang)) {
            return new CCompiler();
        } else {
            return null;
        }
    }
}
