package practice;

public class Recursion {

    public static void main(String[] args) {
        System.out.println(allDollars("hello"));
    }

    public static String allDollars(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return str.charAt(0) + "$" + allDollars(str.substring(1));
    }
}
