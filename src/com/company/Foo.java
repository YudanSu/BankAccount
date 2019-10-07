package com.company;

public class Foo {
    public int x = 0;
    public static int y = 0;
    public static int z = 10;
//    public static int z = 0;
    public static void print(){
        System.out.println("do it");
    }

    //        y = 8;
    public static void main(String[] args){
        Foo f1 = new Foo();
        f1.x = 7;
        f1.y = 3;

        z = 13;
        f1.z = 10;
        print();

        System.out.println(z);
        System.out.println(f1.y);
//        System.out.println(f2.y
//        Foo.z = 13;); // 3
//        System.out.println(f3.x); // 0
//        System.out.println(f3.y); // 3
//
//        System.out.println(f2.z); // this is good
//        System.out.println(Foo.y);
////        System.out.println(foo.y);
    }



}
