package com.wassouf.ali.chainofresponsibilities.classes;

import java.util.Map;
import org.junit.Test;

import static org.junit.Assert.*;

public class TwentyDollarBillDispenserTest
{

    TwentyDollarBillDispenser twentyDollarBillDispenser = new TwentyDollarBillDispenser();

    @Test
    public void makeSureObjectIsNotNull(){
        assertNotNull(twentyDollarBillDispenser);
    }

    @Test
    public void whenEnteringAmountDividableBy20ReturnNumberOfBills(){
        Map<String, Integer> result = twentyDollarBillDispenser.check(80);
        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals(4, result.get("20").intValue());
    }

    @Test
    public void whenEnteringAmountLessThan20ReturnEmpty(){
        Map<String, Integer> result = twentyDollarBillDispenser.check(9);
        assertTrue(result.isEmpty());
    }
}