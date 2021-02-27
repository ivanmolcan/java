package oop.exerciseSupplierDependencyInversion.clients;

import oop.exerciseSupplierDependencyInversion.process.GeneralManufacturingProcess;
import oop.exerciseSupplierDependencyInversion.process.LaptopManufacturingProcess;
import oop.exerciseSupplierDependencyInversion.process.SmartphoneManufacturingProcess;

public class DeviceFactory {

    public static void main(String[] args) {
        GeneralManufacturingProcess sm = new SmartphoneManufacturingProcess("Smartphone");
        GeneralManufacturingProcess lp = new LaptopManufacturingProcess("Laptop");

        sm.launchProcess();
        lp.launchProcess();
    }
}
