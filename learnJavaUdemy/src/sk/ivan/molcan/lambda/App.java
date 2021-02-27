package sk.ivan.molcan.lambda;

public class App {

    public static void main(String[] args) {

        Human tom = new Human();
        walker(tom);

        Robot wale = new Robot();
        walker(wale);

        walker(() -> System.out.println("Custom object walking"));

        walker(() -> {
            System.out.println("Hello");
            System.out.println("There");
        });

        ALambdaInterface aBlockOfCode = () -> {
            System.out.println("1");
            System.out.println("2");
        };

        Walkable aBlockOfCode2 = () -> {
            System.out.println("3");
            System.out.println("4");
        };

        walker(aBlockOfCode2);
        System.out.println("-------------------");

        ALambdaInterface helloVar =()-> System.out.println("Hello There");
        helloVar.someMethod();
        System.out.println("-------------------");

        Calculate sumVar = (a,b) -> a+b;
        System.out.println(sumVar.compute(5,4));

        System.out.println("-------------------");

        Calculate divide = (a,b) -> {
            if(a == 0) return 0;
            return a/b;
        };
        System.out.println(divide.compute(20,5));

        System.out.println("-------------------");

        MyGenericInterface<String> rev = (str)-> {
            String result = "";
            for(int i = str.length()-1; i>=0;i-- ){
                result = result + str.charAt(i);
            }
            return result;
        };
        System.out.println(rev.reverseWork("Vehicle"));

        System.out.println("-------------------");

        MyGenericInterface<Integer> fact = (num) ->{
            int result = 1;
            for(int i =1; i<=num;i++){
                result = i*result;
            }
            return result;
        };
        System.out.println(fact.reverseWork(5));

    }

    public int factorial(int num){
        int result = 1;
        for(int i =1; i<=num;i++){
            result = i*result;
        }
        return result;
    }

    public String reverse(String str){
        String result = "";
        for(int i = str.length()-1; i>=0;i-- ){
            result = result + str.charAt(i);
        }
        return result;
    }

    public int nonZeroDivide(int a, int b){
        if(a ==0){
            return 0;
        }
        return a/b;
    }

    public void sayHello(){
        System.out.println("Hello there");
    }

    public int sum(int arg1, int arg2){
        return arg1+arg2;
    }

    public static void walker(Walkable entity){
        entity.walk();
    }
}

@FunctionalInterface
interface Calculate{
    public int compute(int a, int b);
}

@FunctionalInterface
interface MyGenericInterface<T>{
    public T reverseWork(T str);
}

@FunctionalInterface
interface Factorial{
    public int factorial(int i);
}
