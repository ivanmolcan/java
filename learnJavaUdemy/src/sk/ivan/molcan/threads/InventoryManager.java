package sk.ivan.molcan.threads;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventoryManager {

//    List<Product> soldProductList = new ArrayList<>();
    List<Product> soldProductList = new CopyOnWriteArrayList<>();
    List<Product> purchaseProductList = new ArrayList<>();

    public void populateSoldProducts(){
        for(int i =0; i<300; i++){
            Product prod = new Product(i, "test_product_" + i);
            soldProductList.add(prod);
            System.out.println("ADDED: " + prod);
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void displaySoldProducts(){
        for(Product prod : soldProductList){
            System.out.println("SOLD: " + prod);
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
