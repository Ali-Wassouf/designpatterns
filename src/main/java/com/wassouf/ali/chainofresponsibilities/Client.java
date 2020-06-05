package com.wassouf.ali.chainofresponsibilities;

import com.wassouf.ali.chainofresponsibilities.classes.Dispenser;
import com.wassouf.ali.chainofresponsibilities.classes.FiftyDollarBillDispenser;
import com.wassouf.ali.chainofresponsibilities.classes.TenDollarBillDispenser;
import com.wassouf.ali.chainofresponsibilities.classes.TwentyDollarBillDispenser;
import java.util.Map;

public class Client
{
    private Dispenser fiftyDollarBillDispenser;
    private Dispenser twentyDollarBillDispenser;
    private Dispenser tenDollarBillDispenser;

    public Client(){
        fiftyDollarBillDispenser = new FiftyDollarBillDispenser();
        twentyDollarBillDispenser = new TwentyDollarBillDispenser();
        ((FiftyDollarBillDispenser) fiftyDollarBillDispenser).setNext(twentyDollarBillDispenser);
        tenDollarBillDispenser = new TenDollarBillDispenser();
        ((TwentyDollarBillDispenser) twentyDollarBillDispenser).setNext(tenDollarBillDispenser);
    }

    public Map<String, Integer> withdraw(int amount){
        return fiftyDollarBillDispenser.check(roundDownToNearestMultipleOfTen(amount));
    }

    public int roundDownToNearestMultipleOfTen(int number)
    {
        return number - (number % 10);
    }
}
