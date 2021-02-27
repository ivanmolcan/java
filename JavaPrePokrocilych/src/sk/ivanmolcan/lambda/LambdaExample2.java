package sk.ivanmolcan.lambda;

public class LambdaExample2 {

    public static void main(String[] args) {
        Nasob nasobPiatimi = a -> a*5;

        printNasob(nasobPiatimi);
    }

    interface Nasob{
        int nasob (int a);
    }

    public static void printNasob(Nasob nasob){
        System.out.println(nasob.nasob(10));
    }
}
