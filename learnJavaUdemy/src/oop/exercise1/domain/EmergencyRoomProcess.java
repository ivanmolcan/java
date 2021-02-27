package oop.exercise1.domain;

public class EmergencyRoomProcess {

    public static void main(String[] args) {

        HospitalManagement ERDirector = new HospitalManagement();
        Employee peggy = new Nurse(2, "Peggy", "emergency", true);

        ERDirector.callUpon(peggy);

        System.out.println();
        Employee suzan = new Doctor(2, "Suzan", "emergency", true);
        ERDirector.callUpon(suzan);
    }
}
