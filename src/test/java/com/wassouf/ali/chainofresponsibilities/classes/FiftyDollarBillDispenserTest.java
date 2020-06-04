package com.wassouf.ali.chainofresponsibilities.classes;

import java.util.Map;
import org.junit.Test;

import static org.junit.Assert.*;

public class FiftyDollarBillDispenserTest
{
    FiftyDollarBillDispenser fiftyDollarBillDispenser = new FiftyDollarBillDispenser();

    @Test
    public void makeSureObjectIsNotNull(){
        assertNotNull(fiftyDollarBillDispenser);
    }

    @Test
    public void whenEnteringAnAmountDividableBy50ReturnNumberOfFiftyDollarBills(){
        Map<String, Integer> result = fiftyDollarBillDispenser.check(150);
        assertEquals(1,result.size());
        assertEquals(3, result.get("50").intValue());
    }

    @Test
    public void whenEnteringANumberLessThan50ReturnEmptyResult(){
        Map<String, Integer> result = fiftyDollarBillDispenser.check(3);
        assertTrue(result.isEmpty());
    }
}
