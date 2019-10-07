package com.company.yudan;

import java.util.List;

public abstract class Measurable implements Comparable<Measurable> {
    abstract float getMeasurable();
    public int compareTo(Measurable other){
        if (this.getMeasurable() > other.getMeasurable())
            return 1;
        if (this.getMeasurable() < other.getMeasurable())
            return -1;
        else
            return 0;
    }
    static float average(List<Measurable> items){
        float total = 0.0f;
        for(Measurable obj : items){
            total += obj.getMeasurable();
        }
        return total/items.size();
    }





}
