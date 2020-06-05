package com.wassouf.ali.chainofresponsibilities;

public class Main
{
    public static void main(String... args)
    {
        Client client = new Client();

        System.out.println(client.withdraw(920));
        System.out.println(client.withdraw(900));
        System.out.println(client.withdraw(30));

    }
}
