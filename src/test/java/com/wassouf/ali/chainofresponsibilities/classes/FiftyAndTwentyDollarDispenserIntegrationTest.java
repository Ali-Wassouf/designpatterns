package com.wassouf.ali.chainofresponsibilities.classes;

import java.util.Map;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FiftyAndTwentyDollarDispenserIntegrationTest
{
    FiftyDollarBillDispenser fiftyDollarBillDispenser = new FiftyDollarBillDispenser();
    TwentyDollarBillDispenser twentyDollarBillDispenser = new TwentyDollarBillDispenser();


    @Before
    public void init()
    {
        fiftyDollarBillDispenser.setNext(twentyDollarBillDispenser);
    }


    @Test
    public void whenCallingNextOnFiftyDollarBillDispenserReturnTwentyDollarDispenser()
    {
        assertTrue(fiftyDollarBillDispenser.getNext() instanceof TwentyDollarBillDispenser);
    }


    @Test
    public void whenEnteringSumOfFiftyAndTwentyThenPutTwoEntriesInResult()
    {
        Map<String, Integer> result = fiftyDollarBillDispenser.check(70);
        assertEquals(2, result.size());
        assertEquals(1, result.get("50").intValue());
        assertEquals(1, result.get("20").intValue());
    }


    @Test
    public void whenEnteringAmountLessThan50AndGreaterThan20ResultSizeIsOne()
    {
        Map<String, Integer> result = fiftyDollarBillDispenser.check(25);
        assertEquals(1, result.size());
    }


    @Test
    public void whenEnteringAmountLessThan20ReturnEmptyResult()
    {
        Map<String, Integer> result = fiftyDollarBillDispenser.check(5);
        assertTrue(result.isEmpty());
    }


    @Test
    public void whenEnteringMultiplesOf20ReturnOneElementInResult()
    {
        Map<String, Integer> result = fiftyDollarBillDispenser.check(40);
        assertEquals(1, result.size());
        assertEquals(2, result.get("20").intValue());
    }
}
