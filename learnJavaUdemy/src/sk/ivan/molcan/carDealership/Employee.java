package sk.ivan.molcan.carDealership;

public class Employee {

    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void handelCustomer(Customer cust, boolean finance, Vehicle vehicle){
        double doubleAmount = vehicle.getCost() - cust.getCashOnHand();

        if(finance == true && vehicle.getCost() > cust.getCashOnHand()){
            runCreditHistory(cust, doubleAmount);
        } else if (vehicle.getCost() <= cust.getCashOnHand()){
            processTransaction(cust, vehicle);
        } else {
            System.out.println("Sorry, you do not have enough money. Get out!");
        }
    }

    public void runCreditHistory(Customer cust, double doubleAmount){
        cust.setCashOnHand(0);
        System.out.println("You have to pay " + doubleAmount + " on lease.");
    }

    public void processTransaction(Customer cust, Vehicle vehicle){
        cust.setCashOnHand(cust.getCashOnHand() - vehicle.getCost());
        System.out.println("Your remain is: " + cust.getCashOnHand());
    }
}
