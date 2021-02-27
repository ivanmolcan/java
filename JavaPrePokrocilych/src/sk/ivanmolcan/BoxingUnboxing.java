package sk.ivanmolcan;

public class BoxingUnboxing {

    int i;
    double d;
    long l;

    Integer in;
    Double de;
    Long lg;

    public static void main(String[] args) {
        System.out.println(intToInteger(1));
        System.out.println(doubleToDouble(2.5));
        System.out.println(longToLong(5L));
        System.out.println();
        System.out.println(objectInteger(20));
        System.out.println(objectDouble(25.55));
        System.out.println(objectLong(50L));

    }

    private static long objectLong(Long lg) {
        return lg+1;
    }

    private static double objectDouble(Double de) {
        return de+1;
    }

    private static int objectInteger(Integer in) {
        return in+1;
    }

    private static Long longToLong(long l) {
        return l+1;
    }

    private static Double doubleToDouble(double d) {
        return d+1;
    }

    private static Integer intToInteger(int i) {
        return i+1;
    }
}
