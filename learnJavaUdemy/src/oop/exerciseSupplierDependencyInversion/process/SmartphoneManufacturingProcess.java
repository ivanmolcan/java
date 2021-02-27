package oop.exerciseSupplierDependencyInversion.process;

public class SmartphoneManufacturingProcess extends GeneralManufacturingProcess{

    public SmartphoneManufacturingProcess(String processName) {
        super(processName);
    }

    @Override
    protected void assembleDevice() {
        System.out.println("assembled smartphone");
    }

    @Override
    protected void testDevice() {
        System.out.println("testing smartphone");
    }

    @Override
    protected void packageDevice() {
        System.out.println("packaging smartphone");
    }

    @Override
    protected void storeDevice() {
        System.out.println("storing smartphone");
    }
}
