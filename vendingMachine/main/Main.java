package vendingMachine.main;
import java.util.*;

import vendingMachine.entity.Bucket;
import vendingMachine.entity.Coin;
import vendingMachine.entity.Item;
import vendingMachine.exception.NotFullPaidException;
import vendingMachine.exception.NotSufficientChangeException;
import vendingMachine.exception.SoldOutException;
import vendingMachine.implemenattion.VendingMachineImpl;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Vending Machine");
         VendingMachineImpl vm = new VendingMachineImpl();

        try {
            // Select an item and get its price
            Item selectedItem = Item.COKE; // Change to the desired item
            long itemPrice = vm.selectItemAndGetPrice(selectedItem);
            System.out.println("Selected Item: " + selectedItem + ", Price: " + itemPrice);

            // Insert coins
            Coin[] coinsToInsert = {Coin.PENNY, Coin.NICKLE, Coin.DIME, Coin.QUARTER}; // Change to the desired coins
            for (Coin coin : coinsToInsert) {
                vm.insertCoin(coin);
                System.out.println("Inserted Coin: " + coin);
            }

            // Collect item and change
            Bucket<Item, List<Coin>> bucket = vm.collectItemAndChange();
            Item collectedItem = bucket.getFirst();
            List<Coin> change = bucket.getSecond();
            System.out.println("Collected Item: " + collectedItem);
            System.out.println("Change: " + change);

            // Print vending machine statistics
            System.out.println("Vending Machine Statistics:");
            vm.printStats();

        } catch (SoldOutException e) {
            System.out.println(e.getMessage());
        } catch (NotSufficientChangeException e) {
            System.out.println(e.getMessage());
        } catch (NotFullPaidException e) {
            System.out.println(e.getMessage());
        }
    }
}
