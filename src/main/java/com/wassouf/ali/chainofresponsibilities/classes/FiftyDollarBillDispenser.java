package com.wassouf.ali.chainofresponsibilities.classes;

import java.util.HashMap;
import java.util.Map;

public class FiftyDollarBillDispenser implements Dispenser
{
    private Dispenser next;


    @Override
    public Map<String, Integer> check(int amount)
    {
        Map<String, Integer> result = new HashMap<>();
        if (amount >= 50)
        {
            int numberOf50DollarBills = amount / 50;
            result.put("50", numberOf50DollarBills);
            int remainder = amount % 50;
            if (remainder != 0)
            {
                result.putAll(next.check(remainder));
            }
        }
        else
        {
            result.putAll(next.check(amount));
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
