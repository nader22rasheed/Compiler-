package Visitor;

import AST.HTML.ProgramNode;
import java.nio.file.*;
import java.nio.charset.StandardCharsets;
import java.io.*;

public class HTMLCodeGenVisitor {
    public HTMLCodeGenVisitor() {}

    // very small example: write a placeholder HTML using ProgramNode.toString()
    public void generate(ProgramNode program, String outPath) {
        String html = "<!doctype html>\n<html>\n<head><meta charset=\"utf-8\"><title>Generated</title></head>\n<body>\n";
        html += "<pre>" + program.toString() + "</pre>\n";
        html += "</body>\n</html>\n";
        try {
            Files.writeString(Paths.get(outPath), html, StandardCharsets.UTF_8);
            System.out.println("Wrote generated HTML to " + outPath);
        } catch (IOException e) {
            System.err.println("Codegen write failed: " + e.getMessage());
        }
    }
}
