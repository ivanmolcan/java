package sk.ivanmolcan.suborovaDatabaza;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Kontakt {

    private String meno;
    private String telefon;
    private String mobil;
    private String email;
    private int counter = 0;

    public Kontakt(String meno, String telefon, String mobil, String email) {
        this.meno = meno;
        this.telefon = telefon;
        this.mobil = mobil;
        this.email = email;
        this.counter ++;
    }

    public String getMeno() {
        return meno;
    }

    public String getTelefon() {
        return telefon;
    }

    public String getMobil() {
        return mobil;
    }

    public String getEmail() {
        return email;
    }

    public int getCounter() {
        return counter;
    }

    public static void pridajKontakt(Kontakt k) throws IOException {
        Path path = Paths.get("D:\\Doc\\Programovanie\\Java\\Projects\\JavaPrePokrocilych\\resources\\kontakty\\zoznamKontaktov.txt");
        File file =new File("D:\\Doc\\Programovanie\\Java\\Projects\\JavaPrePokrocilych\\resources\\kontakty\\zoznamKontaktov.txt");
        String myDb = "Moja databaza";
        String inf = "Meno; Telefón; Mobil; Email";
        int cnt=1;

        if(Files.notExists(path)){
            Files.createFile(path);
        }

//        Files.writeString(path, myDb);
//        Files.writeString(path, ((String) cnt));


        try(BufferedWriter br =new BufferedWriter(new FileWriter(file))){
            br.write(myDb);
            br.newLine();
            br.write("Pocet zaznamov: " + cnt);
            cnt++;
            br.newLine();
            br.write(inf);
            br.newLine();
            br.write(k.getMeno() +";" + k.getTelefon() + ";" + k.getMobil() + ";" + k.getEmail());

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Problem reading file: " + file.getName());
        }

        try(BufferedReader br2 = new BufferedReader(new FileReader(file))){
            String line = br2.readLine();

            while(line != null){
                line = br2.readLine();
                System.out.println(line);
            }


        } catch (FileNotFoundException e) {
        System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Problem reading file: " + file.getName());
        }



//        if(Files.readAllLines(path).isEmpty()) {
//            Files.writeString(path, text1);
//        }
//        Files.writeString(path, String.valueOf(kontakt.getCounter() + "\n"), StandardOpenOption.APPEND);
//        Files.writeString(path, text2, StandardOpenOption.APPEND);


    }

    public static void main(String[] args) throws IOException {
        Kontakt kontakt = new Kontakt("Jaroslav Beňo", "048/4199441", "0909111159" ,"jaroslav.beno2@gmail.com");
        pridajKontakt(kontakt);
    }
}
