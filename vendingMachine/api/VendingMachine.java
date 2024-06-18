package vendingMachine.api;

import java.util.List;

import vendingMachine.entity.Bucket;
import vendingMachine.entity.Coin;
import vendingMachine.entity.Item;
import vendingMachine.exception.NotFullPaidException;
import vendingMachine.exception.NotSufficientChangeException;
import vendingMachine.exception.SoldOutException;

public interface VendingMachine {  

    public long selectItemAndGetPrice(Item item)throws SoldOutException;
    public void insertCoin(Coin coin);
    public List<Coin> refund();
    public Bucket<Item, List<Coin>> collectItemAndChange()throws NotSufficientChangeException, NotFullPaidException;  
    public void reset();
}
//You need to design a Vending Machine which
//Accepts coins of 1,5,10,25 Cents i.e. penny, nickel, dime, and quarter.-insertCoin function
//Allow user to select products Coke(25), Pepsi(35), Soda(45)-selectAndGetPrice
//Allow user to take refund by canceling the request.-Refund
//Return the selected product and remaining change if any-collectItemAndChange
//Allow reset operation for vending machine supplier.-reset


