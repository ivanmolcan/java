package sk.jaro;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DebugovanieAStackTrace {
    public static void main(String[] args) throws IOException {
        Path path = getPath();
        readLines(path);

    }

    private static void readLines(Path path) throws IOException {
        for(String line : Files.readAllLines(path)){
            printLine(line);
        }
    }

    private static void printLine(String line) {
        System.out.println(
                line.charAt(10000000)
        );
    }

    private static Path getPath() {
//        return Paths.get("C:\\work\\tools\\Apache Software Foundation\\Tomcat6\\logs\\service-install.log");    //2. funkcne
        return Paths.get("C:\\work\\tools\\Apache Software Foundation\\Tomcat6\\logs\\service-install.txt");     //1. nefunkcne
    }
}
