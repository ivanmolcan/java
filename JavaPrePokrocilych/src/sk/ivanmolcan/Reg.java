package sk.ivanmolcan;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg {

    private static Pattern REG = Pattern.compile("\\s*(\\d+)\\s*([+\\-*/])\\s(\\d+)\\s*");

    public static void main(String[] args) {

        String text = "4+5";
        Matcher matcher = REG.matcher(text);

        if (matcher.find()) {
            System.out.println("Found value: " + matcher.group() );
//            System.out.println("Found value: " + matcher.group(1) );
//            System.out.println("Found value: " + matcher.group(2) );
//            System.out.println("Found value: " + matcher.group(3) );
        } else {
            System.out.println("invalid");
        }
    }

}
