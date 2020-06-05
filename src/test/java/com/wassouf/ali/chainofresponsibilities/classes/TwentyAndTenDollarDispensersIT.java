package com.wassouf.ali.chainofresponsibilities.classes;

import java.util.Map;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TwentyAndTenDollarDispensersIT
{
    private TwentyDollarBillDispenser twentyDollarBillDispenser = new TwentyDollarBillDispenser();
    private TenDollarBillDispenser tenDollarBillDispenser = new TenDollarBillDispenser();

    @Before
    public void init(){
        twentyDollarBillDispenser.setNext(tenDollarBillDispenser);
    }

    @Test
    public void whenCallingNextOnTwentyDollarBillDispenserReturnTenDollarDispenser()
    {
        assertTrue(twentyDollarBillDispenser.getNext() instanceof TenDollarBillDispenser);
    }

    @Test
    public void whenEnteringSumOfTwentyAndTenThenPutTwoEntriesInResult()
    {
        Map<String, Integer> result = twentyDollarBillDispenser.check(30);
        assertEquals(2, result.size());
        assertEquals(1, result.get("20").intValue());
        assertEquals(1, result.get("10").intValue());
    }

    @Test
    public void whenEnteringAmountLessThan50AndGreaterThan20ResultSizeIsOne()
    {
        Map<String, Integer> result = twentyDollarBillDispenser.check(25);
        assertEquals(1, result.size());
    }


    @Test
    public void whenEnteringAmountLessThan10ReturnEmptyResult()
    {
        Map<String, Integer> result = twentyDollarBillDispenser.check(5);
        assertTrue(result.isEmpty());
    }


    @Test
    public void whenEnteringOnly10ReturnOneElement()
    {
        Map<String, Integer> result = twentyDollarBillDispenser.check(40);
        assertEquals(1, result.size());
        assertEquals(2, result.get("20").intValue());
    }
}
