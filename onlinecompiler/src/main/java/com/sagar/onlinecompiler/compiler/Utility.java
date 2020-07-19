package com.sagar.onlinecompiler.compiler;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Utility {

    public static String printLines(InputStream ins) throws Exception {
        String output = "";
        String line;
        BufferedReader in = new BufferedReader(new InputStreamReader(ins));
        String ls = System.getProperty("line.separator");
        while ((line = in.readLine()) != null) {
            output = output + line + ls;
            System.out.println(line);
        }
        return output;
    }

    public static String runCommand(String command) throws Exception {
        String stdout, stderr;
        Process pro = Runtime.getRuntime().exec(command);
        stdout = Utility.printLines(pro.getInputStream());
        stderr = Utility.printLines(pro.getErrorStream());
        pro.waitFor();
        return (pro.exitValue() > 0) ? stderr : stdout;
    }

    public static String getArguments(String[] args) {
        String allArguments = " ";
        if (args != null && args.length > 0) {
            for (String a : args) {
                allArguments = allArguments + " " + a;
            }
        }
        return allArguments;
    }

    public static void createFile(String script, String fileName) {
        try {
            File file = new File(fileName);
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(script);
            bw.close();
            System.out.println("File created: " + file.getName());
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void deleteFile(String fileName) {
        try {
            Files.deleteIfExists(Paths.get(fileName));
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
