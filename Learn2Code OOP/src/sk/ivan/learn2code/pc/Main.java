package sk.ivan.learn2code.pc;

public class Main {

    public static void main(String[] args) {
        StaticData data = new StaticData();
        Assembly assembly = new Assembly(data.cpu, data.ram, data.gpu, data.tower);
        System.out.println();
        System.out.println(assembly);
    }
}
