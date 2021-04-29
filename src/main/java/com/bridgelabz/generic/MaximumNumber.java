package com.bridgelabz.generic;

import java.util.*;
public class MaximumNumber {

    //@maximum method check maximum by using generic concept
    public  <T extends Comparable> T maximum(T first_value, T second_value, T third_value) {
        T maximum = first_value;
        if (second_value.compareTo(maximum) > 0)
            maximum = second_value;
        if (third_value.compareTo(maximum) > 0)
            maximum = third_value;
        System.out.println("Maximum value=" + maximum);
        return maximum;
    }
}
