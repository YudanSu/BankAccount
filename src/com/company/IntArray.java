package com.company;

import java.util.Arrays;

public class IntArray {
    int[] arr;
    public int result;
    public int size = 0;


    public IntArray(){
        this.arr = new int[10];

    }
    public IntArray(int length){
        this.arr = new int[length];
    }

    public void add(int num){
        if (size < arr.length){
            arr[size] = num;
            size++;
        }else{
            int[] newArr = new int[arr.length * 2];
            // the length of " i" should be the short array. otherwise "i" out of index.
            for (int i = 0; i < arr.length; i++){

                newArr[i] = arr[i];
            }
            newArr[size] = num;
            size++;
            this.arr = newArr;
        }
    }
    public void add(int index, int x){
        if (index > size && index > arr.length){
            int[] newArr1 = new int[arr.length + index];
            for (int i = 0;i < arr.length; i++){
                newArr1[i] = arr[i];
            }
            for (int j = arr.length; j <= index + 1; j++){
                if (j == index){
                    newArr1[index-arr.length] = x;
                }
            }
            size = index + 1;
            this.arr = newArr1;
        } else {
            int[] newArr = new int[arr.length + 1];
            for (int i = 0; i <= size; i++) {
                if (i < index)
                    newArr[i] = arr[i];
                if (i > index)
                    newArr[i] = arr[i - 1];
            }
            newArr[index] = x;
            this.arr = newArr;
            if (index < size)
                size += 1;
            else
                size = index + 1;
        }
    }
    public void set(int index, int x){
        if( index < arr.length) {
            arr[index] = x;
            size = index + 1;
        }
        if (index > arr.length) {
            int[] newArr = new int[arr.length + index + 1];
            for (int j = 0; j < arr.length; j++) {
                newArr[j] = arr[j];
            }
            newArr[index] = x;
            size = index + 1;
            this.arr = newArr;
        }
    }

    public void delete(int index) {
        boolean valid = false;
        while (!valid) {
            if (index > arr.length) {
                System.out.println("input is out of range");
                break;
            }
            for (int i = index + 1; i < arr.length; i++) {
                arr[i - 1] = arr[i];
            }
            size--;
            valid = true;
        }
    }
    public String toString(){
        return "Array contents: " + Arrays.toString(arr) + "; Size: " + size;
    }


    public boolean equals(IntArray a){
        if (this.size != a.size)
            return false;
        for ( int i = 0; i < this.size; i++) {
            if (this.arr[i] != a.arr[i]) {
//                System.out.println( a + " and " + b + " are not equal."); // can i print something in front of return?
                //no, print something in front of return is special for debugging.
                return false;
            }
        }
        return true;
    }



    public static void main (String[] args){
        IntArray array = new IntArray();
        IntArray brray = new IntArray();
        // brray.add(3);
        array.add(3);
        //array.add(20,144);
        ;
        //array.add(0,188);
        array.set(11,100);
        array.add(22,400);
        //array.delete(3);
        //System.out.println(array == brray);
        System.out.println(array);
        // System.out.println(22); // "22"
//        for (int c : array.arr)
//            System.out.println(c);

    }


}
