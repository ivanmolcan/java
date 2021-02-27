package sk.ivanmolcan.inputOutput;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class InputOutput {

    static void uloha1(){
        Path path = Paths.get("D:\\Doc\\Programovanie\\Java\\Projects\\JavaPrePokrocilych\\resources\\text.txt");

        try(Scanner scanner = new Scanner(Files.newBufferedReader(path))){
            while(scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void uloha2(){
        Path path = Paths.get("D:\\Doc\\Programovanie\\Java\\Projects\\JavaPrePokrocilych\\resources\\text.txt");

        try(Scanner scanner = new Scanner(Files.newBufferedReader(path))){
            Files.writeString(path, "\nNova veta.", StandardOpenOption.APPEND);
            while(scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void uloha3(){
        Path path = Paths.get("D:\\Doc\\Programovanie\\Java\\Projects\\JavaPrePokrocilych\\resources\\text.txt");
        String text = "";
        String finalText = "";

        try(Scanner scanner = new Scanner(Files.newBufferedReader(path))){
            while(scanner.hasNext()){
                text += scanner.nextLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String[] textArray = text.split("[ .]");

        for(String j : textArray){
            finalText = j;
            if(finalText.length() < j.length()){
                finalText = j;
            }
        }
        System.out.println(finalText);
    }

    public static void uloha4(){
        Path path = Paths.get("D:\\Doc\\Programovanie\\Java\\Projects\\JavaPrePokrocilych\\resources\\text.txt");
        try{
            double bytes = (Files.size(path));
            System.out.println(bytes/1024 + " kb");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String uloha5(String path){
        Path finalPath = Paths.get(path);
        if(Files.isDirectory(finalPath)){
            return "It's directory";
        } else if(Files.isRegularFile(finalPath)){
            return "It's file";
        }
        return "No one knows";
    }

    public static void uloha6(String directory) {
        Path folder = Paths.get(directory);
        if (Files.isDirectory(folder)) {
            try {
                Files.list(folder).forEach(System.out::println);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Bad path");
        }
    }

    static void uloha7(String path){
        Path deleteFile = Paths.get(path);
        try{
            if(Files.isRegularFile(deleteFile)){
                Files.delete(deleteFile);
            } else {
                System.out.println("No files in there");
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void uloha8(){
        Path path = Paths.get("D:\\Doc\\Programovanie\\Java\\Projects\\JavaPrePokrocilych\\resources\\text.txt");
        Path copyPath = Paths.get("D:\\Doc\\Programovanie\\Java\\Projects\\JavaPrePokrocilych\\resources\\1\\text.txt");
        try{
            Files.copy(path, copyPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void uloha9(String file){
        Path path = Paths.get("D:\\Doc\\Programovanie\\Java\\Projects\\JavaPrePokrocilych\\resources\\2\\"+ file);
        try{
            if(!Files.exists(path)){
                Files.createFile(path);
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void uloha10(String file){
        Path path = Paths.get("D:\\Doc\\Programovanie\\Java\\Projects\\JavaPrePokrocilych\\resources\\2\\"+ file);
        try{
            if(!Files.exists(path)){
                Files.createFile(path);
                System.out.println(path.toRealPath().toString());
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
//        uloha1();
//        uloha2();
//        uloha3();
//        uloha4();
//        System.out.println(uloha5("D:\\Doc\\Programovanie\\Java\\Projects\\JavaPrePokrocilych\\resources\\text.txt"));
//        uloha6("D:\\Doc\\Programovanie\\Java\\Projects\\JavaPrePokrocilych\\resources\\");
//        uloha7("D:\\Doc\\Programovanie\\Java\\Projects\\JavaPrePokrocilych\\resources\\text.txt");
//        uloha8();
//        uloha9("snek.txt");
        uloha10("snek.txt");
    }
}
