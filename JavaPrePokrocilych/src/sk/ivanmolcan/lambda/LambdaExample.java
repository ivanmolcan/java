package sk.ivanmolcan.lambda;

public class LambdaExample {

//    public int nasobokPiatich(int i){
//        return i*5;
//    }

//    prevedene na lambda
//    (int i) -> i*5;

    public static void main(String[] args) {
        Hocijako hocijako = (int a, int b) -> {
            if(b == 0) {
                return 0;
            }
            return a/b;
        };

        System.out.println(hocijako.hocico(10, 2));
    }

    interface Hocijako{
        double hocico(int x, int y);
    }

}
