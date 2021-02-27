package oop.exerciseRemoteControlSingleton.remotes;

import oop.exerciseRemoteControlSingleton.devices.Device;

public enum RemoteControl {

    SINGLE_INSTANCE;

    public void choosingDeviceToConnect(Device dev){
        System.out.println(dev.getName() + " is connected.");
    }

    public void turningOn(Device dev){
        System.out.println(dev.getName() + " is on.");
        dev.perform();
    }

    public void turningOff(Device dev){
        System.out.println(dev.getName() + " is off.");
    }

}
