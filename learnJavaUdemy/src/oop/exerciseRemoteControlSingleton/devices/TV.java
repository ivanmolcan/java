package oop.exerciseRemoteControlSingleton.devices;

public class TV extends Device {

    public TV(String name) {
        super(name);
    }

    private void working(){
        System.out.println(this.getName() + " is functioning.");
    }

    private void showingSport(){
        System.out.println("Sport is showing on " + this.getName() + ".");
    }

    @Override
    public void perform() {
        working();
        showingSport();
    }
}
