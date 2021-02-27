package oop.exercise1.domain;

public class Doctor extends Employee{

    public Doctor(long id, String name, String department, boolean working) {
        super(id, name, department, working);
        System.out.println("Doctor in action...");
    }

    private void prescribeMedicine(){
        System.out.println("Prescribe Medicine");
    }

    private void diagnosePatients(){
        System.out.println("Diagnosing patient");
    }

    @Override
    public void performDuties() {
        prescribeMedicine();
        diagnosePatients();
    }
}
