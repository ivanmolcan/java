package oop.exerciseRemoteControlSingleton.devices;

public class SurroundSoundSystem extends Device {

    public SurroundSoundSystem(String name) {
        super(name);
    }

    private void working(){
        System.out.println(this.getName() + " is functioning.");
    }

    private void runningMusic(){
        System.out.println("Running loud music " + this.getName() + ".");
    }

    @Override
    public void perform() {
        working();
        runningMusic();
    }
}
