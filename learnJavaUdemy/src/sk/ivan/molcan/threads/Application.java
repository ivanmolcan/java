package sk.ivan.molcan.threads;

public class Application {

    public static void main(String[] args) throws InterruptedException {
        InventoryManager manager = new InventoryManager();

        Thread inventoryTask = new Thread(new Runnable() {
            @Override
            public void run() {
                manager.populateSoldProducts();
            }
        });

        Thread displayTask = new Thread(new Runnable() {
            @Override
            public void run() {
                manager.displaySoldProducts();
            }
        });

        inventoryTask.start();

        //funguje na obycajny list a zariadi tym, ze najprv pocka kym sa naplni a az potom spusti dalsi
        /* thread, neplati pri CopyOnWriteArrayList, ktory je uz synchronizovany
         */
        inventoryTask.join();
        displayTask.start();
    }
}
