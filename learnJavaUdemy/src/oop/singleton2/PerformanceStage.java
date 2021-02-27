package oop.singleton2;

public class PerformanceStage {

    private static PerformanceStage INSTANCE = null;
    private static int counter;

    private PerformanceStage(){
        counter++;
    }

    //synchronized for thread safe
    public synchronized static PerformanceStage getInstance(){
        if(INSTANCE == null){
            INSTANCE = new PerformanceStage();
        }
        return INSTANCE;
    }

    public void turnOnLights(){
        System.out.println("turned on lights...");
    }

    public int getCounter(){
        return counter;
    }
}
