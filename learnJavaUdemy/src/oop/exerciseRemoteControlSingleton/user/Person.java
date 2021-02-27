package oop.exerciseRemoteControlSingleton.user;

import oop.exerciseRemoteControlSingleton.devices.Projector;
import oop.exerciseRemoteControlSingleton.devices.SurroundSoundSystem;
import oop.exerciseRemoteControlSingleton.devices.TV;
import oop.exerciseRemoteControlSingleton.remotes.RemoteControl;

public class Person {

    public static void main(String[] args) {

        TV tv = new TV("Samsung TV");
        SurroundSoundSystem surr = new SurroundSoundSystem("Sony Sound System");
        Projector pr = new Projector("LG Projector");

        RemoteControl singleton = RemoteControl.SINGLE_INSTANCE;
        singleton.choosingDeviceToConnect(tv);
        singleton.turningOn(tv);
        singleton.turningOff(tv);
        System.out.println();

        singleton.choosingDeviceToConnect(pr);
        singleton.turningOn(pr);
        singleton.turningOff(pr);
        System.out.println();

        singleton.choosingDeviceToConnect(surr);
        singleton.turningOn(surr);
        singleton.turningOff(surr);
    }
}
