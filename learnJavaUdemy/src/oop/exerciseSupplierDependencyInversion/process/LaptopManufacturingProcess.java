package oop.exerciseSupplierDependencyInversion.process;

public class LaptopManufacturingProcess extends GeneralManufacturingProcess{

    public LaptopManufacturingProcess(String processName) {
        super(processName);
    }

    @Override
    protected void assembleDevice() {
        System.out.println("assembled laptop");
    }

    @Override
    protected void testDevice() {
        System.out.println("testing laptop");
    }

    @Override
    protected void packageDevice() {
        System.out.println("packaging laptop");
    }

    @Override
    protected void storeDevice() {
        System.out.println("storing laptop");
    }
}
