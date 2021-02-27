package oop.factoryDesignPattern;

public class VehicleFactory {

//    public Vehicle getVehicle(String vehicleType){
//
//        if(vehicleType.equalsIgnoreCase("TRUCK")){
//            return new Truck();
//        } else if (vehicleType.equalsIgnoreCase("CAR")){
//            return new Car();
//        }
//
//        return null;
//    }

    VehicleType vehicleType;

    public Vehicle getVehicle(VehicleType vehicletype){
        return vehicletype.getVehicle();
    }
}
