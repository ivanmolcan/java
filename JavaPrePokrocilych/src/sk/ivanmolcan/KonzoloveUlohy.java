package sk.ivanmolcan;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.sql.SQLOutput;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class KonzoloveUlohy {

    static void uloha1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type something in please:");

        while(true){
            String text = scanner.nextLine().trim();
            if("q".equals(text)) {
                break;
            }
            System.out.println("-------------------");
        }
        scanner.close();
    }

    static void uloha3(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type any number of your choice: ");
        String text = scanner.nextLine().trim();

        String regex = "(^\\d+$)";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(text);

        if(m.find()){
            System.out.println("Great, number.");
        } else {
            System.out.println("This is not a number.");
        }

    }

    static void uloha4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type your mathematic operation");
        String st = scanner.nextLine().trim();

        int result;
        for(int i=0;i<st.length();i++)
        {
            if(st.charAt(i)=='+')
            {
                result=Integer.parseInt(st.substring(0, i)) + Integer.parseInt(st.substring(i+1, st.length()));
                System.out.print(result);
            } else if(st.charAt(i)=='-'){
                result=Integer.parseInt(st.substring(0, i)) - Integer.parseInt(st.substring(i+1, st.length()));
                System.out.print(result);
            } else if(st.charAt(i)=='*'){
                result=Integer.parseInt(st.substring(0, i)) * Integer.parseInt(st.substring(i+1, st.length()));
                System.out.print(result);
            } else if(st.charAt(i)=='/'){
                result=Integer.parseInt(st.substring(0, i)) / Integer.parseInt(st.substring(i+1, st.length()));
                System.out.print(result);
            }
        }
    }

    static void uloha5(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type your local time");
        scanner.useDelimiter(":|\\s+");
        String h = scanner.nextLine().trim();
        String m = scanner.nextLine().trim();
        String s = scanner.nextLine().trim();

        LocalTime lt = LocalTime.parse(h + ":" + m + ":" + s).plusHours(8);
        System.out.println(lt);
    }

    static void uloha6(String time, int i){

        LocalTime lt = LocalTime.parse(time).plusHours(i);
        System.out.println(lt);
    }

    public static void uloha7(String date){
        LocalDate lt = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        LocalDate lt21 = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd.MM.yyyy")).plusYears(1);
        LocalDate lt22 = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd.MM.yyyy")).plusYears(2);
        DayOfWeek dw = lt.getDayOfWeek();
        DayOfWeek dw21 = lt21.getDayOfWeek();
        DayOfWeek dw22 = lt22.getDayOfWeek();
        System.out.println(dw);
        System.out.println("2021: " + dw21);
        System.out.println("2022: " + dw22);

    }

    static void uloha8(){
//        String date = LocalDate.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        String date = "1.5.2020";
        int num = 0;
        String[] holidays = {"1.1.2020","6.1.2020","10.4.2020","13.4.2020","1.5.2020","8.5.2020"};
        for(int i=0; i< holidays.length;i++){
            if(holidays[i] == date){
                System.out.println("Je sviatok");
                num +=1;
            }
        }
        if(num == 0){
            System.out.println("Nie je to sviatok");
        }
    }

    static void palindrom(String palindrom){
        char[] charArray = palindrom.toCharArray();
        int yes = 0;
        for(int i = 0; i<charArray.length;i++){
            if(charArray[i] != charArray[(charArray.length-1)-i]){
                yes += 1;
            }
        }
        if(yes > 0){
            System.out.println("Nie je to palindrom");
        } else {
            System.out.println("Je to palindrom");
        }
    }

    public static int sorting(int k){
        int[] pool = {7,5,2,3,4,1,6};
        Arrays.sort(pool);
        return pool.length - k;
    }

    public static void numbersSorting () {
        int[] array = {4, 2, 1, 3, 5, 9, 6, 8, 7};

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        for(int i : array){
            System.out.print(i + ", ");
        }
    }

    public static void main(String[] args) throws Exception {
//        uloha1();
//        uloha3();
//        uloha4();
//        uloha5();
//        uloha6("01:10:48", 8);
//        uloha7("04.12.2020");
//        uloha8();
//        palindrom("madam");
//        System.out.println(sorting(0));
        numbersSorting();
    }
}
