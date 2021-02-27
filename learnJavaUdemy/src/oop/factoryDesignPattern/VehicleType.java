package oop.factoryDesignPattern;

public enum VehicleType {
    CAR{
     public Vehicle getVehicle(){
         return new Car();
     }
    }
    , TRUCK{
        public Vehicle getVehicle(){
            return new Truck();
        }
    };

    abstract  Vehicle getVehicle();

//    public static Vehicle getVehicle(VehicleType vehicleType){
//        Vehicle v = null;
//        switch(vehicleType){
//            case CAR: v = new Car();
//            break;
//            case TRUCK: v = new Truck();
//            break;
//            default:
//                System.out.println("Nothing");
//                break;
//        }
//        return v;
//    }
}
