package com.adison;

public class SomeClass extends SomeClassParent {

    private int status;

    static {
        System.out.println("1) Static initializer run");
        SomeClass instance = new SomeClass();
    }

    {
        System.out.println("3) Instance initializer run");
    }

    public SomeClass(int status) {
        System.out.println("4) One-arg constructor run");
        this.status = status;
    }

    public SomeClass() {
        this(56);
        System.out.println("5) After call to 'this' in no-arg constructor");
    }
}

