package oop.coffeeShop;

import oop.coffeeShop.observers.Customer;
import oop.coffeeShop.subjects.CoffeeAttendent;

public class CoffeeShop {

    public static void main(String[] args) {
        CoffeeAttendent att = new CoffeeAttendent();
        Customer cus = new Customer("Peter", "tea");
        Customer cus2 = new Customer("Suzy", "coffee");

        att.takeOrder(cus);
        att.prepareDrink(cus.getDrinkOrdered());

        att.takeOrder(cus2);
        att.prepareDrink(cus2.getDrinkOrdered());

        att.callOutCompletedOrders();

    }
}
