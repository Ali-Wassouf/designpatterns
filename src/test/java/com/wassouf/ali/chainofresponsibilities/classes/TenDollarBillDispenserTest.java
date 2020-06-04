package com.wassouf.ali.chainofresponsibilities.classes;

import java.util.Map;
import org.junit.Test;

import static org.junit.Assert.*;

public class TenDollarBillDispenserTest
{
    TenDollarBillDispenser tenDollarBillDispenser = new TenDollarBillDispenser();

    @Test
    public void makeSureObjectNotNull(){
        assertNotNull(tenDollarBillDispenser);
    }

    @Test
    public void whenEnteringAmountDividableBy10ReturnNumberOfBills(){
        Map<String, Integer> result = tenDollarBillDispenser.check(30);
        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals(3, result.get("10").intValue());
    }

    @Test
    public void whenEnteringAmountLessThan10ReturnEmpty(){
        Map<String, Integer> result = tenDollarBillDispenser.check(7);
        assertTrue(result.isEmpty());
    }
}