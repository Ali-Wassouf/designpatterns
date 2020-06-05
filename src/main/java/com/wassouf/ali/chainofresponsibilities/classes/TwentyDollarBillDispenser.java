package com.wassouf.ali.chainofresponsibilities.classes;

import java.util.HashMap;
import java.util.Map;

public class TwentyDollarBillDispenser implements Dispenser
{
    private Dispenser next;


    @Override
    public Map<String, Integer> check(int amount)
    {
        Map<String, Integer> result = new HashMap<>();
        if (amount >= 20)
        {
            int numberOf10DollarBills = amount / 20;
            result.put("20", numberOf10DollarBills);
            int remainder = amount % 20;
            if (remainder != 0)
            {
                result.putAll(next.check(remainder));
            }
        }
        return result;
    }


    public Dispenser getNext()
    {
        return next;
    }


    public void setNext(Dispenser next)
    {
        this.next = next;
    }
}
