package com.wassouf.ali.singleton;

public class SingletonThreadSafeLockFree
{
    private static final SingletonThreadSafeLockFree instance = new SingletonThreadSafeLockFree();


    private SingletonThreadSafeLockFree()
    {
        System.out.println("Singleton has been created");
    }


    public synchronized static SingletonThreadSafeLockFree getInstance()
    {
        return instance;
    }


    public void doSomething()
    {
        System.out.println("Doing Something");
    }
}
