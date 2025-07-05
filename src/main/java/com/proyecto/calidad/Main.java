package com.proyecto.calidad;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (PrintWriter w = new PrintWriter("output/index.html", "UTF-8")) {
            w.println("<h1>Hello from Java CI/CD!</h1>");
            w.println("<p><a href=\"../target/site/checkstyle.html\">Ver reporte Checkstyle</a></p>");
            w.println("<p><a href=\"../target/site/pmd.html\">Ver reporte PMD</a></p>");
            w.println("<p><a href=\"../target/site/jacoco/index.html\">Ver reporte JaCoCo</a></p>");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}