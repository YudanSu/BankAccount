package com.company;

public class Person {
    public String firstName;
    public String lastName;

    String fullName(){
        return firstName+ " "+ lastName;
    }
    public static void main(String[] args){
        Person dave = new Person();
        Person sally = new Person();
        sally.firstName = "Sally";
        sally.lastName = "Jones";
        dave.firstName = "Dave";
        dave.lastName = "Jones";
//        dave = sally;
        dave.firstName = "Bob";

        if (dave.lastName == sally.lastName)
            System.out.println("Yes");
        else
            System.out.println("fail");

        String s = new String("hello");
        String t = new String("hello");
        System.out.println(s == t);
    }

}
