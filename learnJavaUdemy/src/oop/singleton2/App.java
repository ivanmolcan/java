package oop.singleton2;

public class App {

    public static void main(String[] args) {
        PerformanceStage per = PerformanceStage.getInstance();

        per.turnOnLights();
    }
}
