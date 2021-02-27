package sk.ivan.molcan.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) throws FileNotFoundException {

//        Scanner input = new Scanner(System.in);
//        String enteredText = input.nextLine();
//        System.out.println(enteredText);

        File file = new File("D:\\Doc\\Programovanie\\Java\\Projects\\learnJavaUdemy\\src\\sk\\ivan\\molcan\\myfile.txt");
        Scanner input = new Scanner(file);

        while(input.hasNextLine()){
            String line = input.nextLine();
            System.out.println(line);
        }
        input.close();

        MyFileUtils myfile = new MyFileUtils();
        try {
            System.out.println(myfile.substract(5));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
