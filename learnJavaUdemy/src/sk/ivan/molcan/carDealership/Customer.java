package sk.ivan.molcan.carDealership;

public class Customer {

    private String name;
    private String address;
    private double cashOnHand;
    private boolean finance;

    public Customer(String name, String address, double cashOnHand, boolean finance) {
        this.name = name;
        this.address = address;
        this.cashOnHand = cashOnHand;
        this.finance = finance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getCashOnHand() {
        return cashOnHand;
    }

    public void setCashOnHand(double cashOnHand) {
        this.cashOnHand = cashOnHand;
    }

    public boolean isFinance() {
        return finance;
    }

    public void setFinance(boolean finance) {
        this.finance = finance;
    }

    public void purchaseCar(Vehicle vehicle, Employee emp, boolean finance){
        emp.handelCustomer(this, finance, vehicle);
//        System.out.println("I choose this car: " + vehicle.getName() + ". I would like to have this employee for my transaction " + emp.getName() + ". And my finance are: " + finance);
    }

}
