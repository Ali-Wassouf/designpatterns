package com.wassouf.ali.singleton;

public class Demo
{

    public static void main(String... args)
    {
        Runnable runnable1 = () -> {
            SingletonThreadSafeLockFree singletonThreadSafeLockFree = SingletonThreadSafeLockFree.getInstance();
            singletonThreadSafeLockFree.doSomething();
        };
        Runnable runnable2 = ()->{
            SingletonThreadSafeLockFree singletonThreadSafeLockFree = SingletonThreadSafeLockFree.getInstance();
            singletonThreadSafeLockFree.doSomething();
        };

        runnable1.run();
        runnable2.run();
    }
}
