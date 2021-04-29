package com.bridgelabz.generic;

import java.util.*;
public class MaximumNumber <T extends Comparable > {
    T first_value;
    T second_value;
    T third_value;

    public MaximumNumber(T first_value, T second_value, T third_value) {
        this.first_value = first_value;
        this.second_value = second_value;
        this.third_value = third_value;
    }

    //@maximum method check maximum by using generic concept
    public  <T>  T maximum() {
        T maximum = (T) first_value;
        if (second_value.compareTo(maximum) > 0)
            maximum = (T) second_value;
        if (third_value.compareTo(maximum) > 0)
            maximum = (T) third_value;
        System.out.println("Maximum value=" + maximum);
        return maximum;
    }

    //@maximum check maximum with more than three parameter
    public  <T extends Comparable> T maximum(T ... elements) {
        Arrays.sort(elements);
        T max = (T) elements[0];
        for (T element : elements){
            if(element.compareTo(max) > 0)
                max = element;
        }
        return max;
    }
}
