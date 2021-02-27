package oop.exerciseRemoteControlSingleton.devices;

public class Projector extends Device {

    public Projector(String name) {
        super(name);
    }

    private void working(){
        System.out.println(this.getName() + " is functioning");
    }

    private void running(){
        System.out.println(this.getName() + " is projecting action movie.");
    }

    @Override
    public void perform() {
        working();
        running();
    }
}
