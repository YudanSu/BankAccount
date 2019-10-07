package com.company;

public class Goo {
    public Foo foo = new Foo();


    public static void main(String[] args){
        Goo goo = new Goo();
        Foo.z = 6;
        System.out.println(goo.foo.z);
    }
}
