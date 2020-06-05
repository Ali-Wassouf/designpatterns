package com.wassouf.ali.chainofresponsibilities;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClientTest
{
    private Client client = new Client();


    @Test
    public void init()
    {
        Assert.assertNotNull(client);
    }

    @Test
    public void whenEnteringAmountNotMultipleOfTenRoundDown(){
        assertEquals(10,client.roundDownToNearestMultipleOfTen(11));
    }
    @Test
    public void whenEnteringAmountLessThan10ReturnZero(){
        assertEquals(0,client.roundDownToNearestMultipleOfTen(4));
    }

    @Test
    public void whenWithDrawing80returnThreeEntriesInResult(){
        assertEquals(3, client.withdraw(80).size());
    }

}