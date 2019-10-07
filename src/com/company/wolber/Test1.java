package com.company.wolber;

public class Test1 {
    private String firstName;
    protected String lastName;
    int age;// this is "default".




    public static void main (String[] args){
        Test1 t = new Test1();
        t.firstName = "dave";
        t.lastName = "bob";
        System.out.println(t.firstName);
    }
}
