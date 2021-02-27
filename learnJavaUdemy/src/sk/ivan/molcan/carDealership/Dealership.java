package sk.ivan.molcan.carDealership;

public class Dealership {


    public static void main(String[] args) {
        Customer cust1 = new Customer("Tom", "123 Anything St.", 22000, true);
        Employee emp = new Employee("John");
        Vehicle vehicle = new Vehicle("BMW", 20000);
        Vehicle vehicle2 = new Vehicle("BMW", 20000);

        System.out.println("------------------------------");

        cust1.purchaseCar(vehicle, emp, cust1.isFinance());

        boolean val = vehicle.equals(vehicle2);
        System.out.println(val);

    }

}
