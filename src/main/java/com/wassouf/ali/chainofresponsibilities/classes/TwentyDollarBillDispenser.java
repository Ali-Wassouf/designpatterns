package com.wassouf.ali.chainofresponsibilities.classes;

import java.util.HashMap;
import java.util.Map;

public class TwentyDollarBillDispenser implements Dispenser
{
    @Override
    public Map<String, Integer> check(int amount)
    {
        Map<String, Integer> result = new HashMap<>();
        if (amount >= 20)
        {
            int numberOfBills = amount / 20;
            result.put("20", numberOfBills);
        }

        return result;
    }
}
