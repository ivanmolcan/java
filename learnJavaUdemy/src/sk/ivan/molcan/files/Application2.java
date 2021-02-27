package sk.ivan.molcan.files;

import java.io.*;

public class Application2 {

    public static void main(String[] args) {
        File file = new File("D:\\Doc\\Programovanie\\Java\\Projects\\learnJavaUdemy\\src\\sk\\ivan\\molcan\\myfile.txt");
        BufferedReader buffered = null;
        FileReader fileReader = null;

        try {
            fileReader = new FileReader(file);
            buffered = new BufferedReader(fileReader);

            String line = buffered.readLine();

            while(line != null){
                System.out.println(line);
                line = buffered.readLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
//            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Problem reading file: " + file.getName());
//            e.printStackTrace();
        } finally {
            try {
                if(buffered != null){
                    buffered.close();
                }
                if(fileReader != null){
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
