package oop.exerciseRemoteControlSingleton.devices;

public abstract class Device {

    private String name;

    public Device(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void perform();

    @Override
    public String toString() {
        return "Device{" +
                "name='" + name + '\'' +
                '}';
    }
}
