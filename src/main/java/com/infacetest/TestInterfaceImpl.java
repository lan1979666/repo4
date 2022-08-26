package com.infacetest;

public class TestInterfaceImpl implements TestInterface {

    @Override
    public void printTest() {
        System.out.println("test");
    }

    public static void main(String[] args) {
        TestInterface testInterface = new TestInterfaceImpl();
        testInterface.printTest();

        TestInterface testInterface02 = new TestInterfaceImpl02();
        testInterface02.printTest();

    }
}
