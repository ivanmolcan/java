package sk.dominikvrbovsky;

public class Main {

    public static void main(String[] args) {
	Double number = 15.6;
	Integer number1 = 87;

        priklad(number);
        priklad(number1);
    }

    static void priklad(Number number) {
        if (number instanceof Integer) {
            System.out.println((int) number * 10);
        }

        if (number instanceof Double) {
            System.out.println((double) number * 10);
        }

    }
}
