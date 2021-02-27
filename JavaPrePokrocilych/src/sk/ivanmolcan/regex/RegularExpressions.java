package sk.ivanmolcan.regex;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {

     static void metoda1(){
         Scanner scanner = new Scanner(System.in);
         System.out.println("State your email please:");
         String email = scanner.nextLine().trim();

         String regex = "\\w+@\\w+\\.\\w{2}";
         Pattern p = Pattern.compile(regex);
         Matcher m = p.matcher(email);
         System.out.println(m.matches());

     }

     public static void metoda2(){
         Scanner scanner = new Scanner(System.in);
         System.out.println("State your password please:");
         String email = scanner.nextLine().trim();

         String regex = "^(?=.*[A-Z])(?=.*[0-9]).{8,40}$";
         Pattern p = Pattern.compile(regex);
         Matcher m = p.matcher(email);
         boolean match = m.find();
         System.out.println(match);
     }

    public static void metoda3(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert your picture please:");
        String email = scanner.nextLine().trim();

        String regex = "([^.+]+(\\.(?i)(jpe?g|bmp|png))$)";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(email);
        boolean match = m.find();
        System.out.println(match);
    }

    static void metoda4(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert your picture please please:");
        String email = scanner.nextLine().trim();

        String regex = "^(3[01]|[12][0-9]|0[1-9]).(1[0-2]|0[1-9]).[0-9]{4}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(email);
        boolean match = m.find();
        System.out.println(match);
    }

    static void metoda5(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert your text please: ");
        String text = scanner.nextLine().trim();
        String[] splitText = text.split(" ");
        int pocetVelkychPismen = 0;

        for(int i=0; i< splitText.length; i++){
            if(splitText[i].matches("(^[A-Z].*$)")){
                pocetVelkychPismen++;
            }
        }
        System.out.println(pocetVelkychPismen);
    }

    static void metoda6(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert your text please: ");
        String text = scanner.nextLine().trim();

        String regex = "[0-9]";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(text);

        while(m.find()){
            System.out.print(m.group() + " ");
        }
    }

    /**
     *
     * @param args
     */

    public static void main(String[] args) {

//        metoda5();
//        metoda6();
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

    }
}
