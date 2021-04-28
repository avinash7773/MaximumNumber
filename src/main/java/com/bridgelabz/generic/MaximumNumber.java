package com.bridgelabz.generic;

public class MaximumNumber {

    //@Method maximumIntegerNumber check maximum integer from given integer numbers
    public  int maximumIntegerNumber(Integer first_number, Integer second_number, Integer third_number) {
        int maximum = first_number;
        if (second_number.compareTo(maximum) > 0)
            maximum = second_number;
        if (third_number.compareTo(maximum) > 0)
            maximum = third_number;
        System.out.println("Maximum number=" + maximum);
        return maximum;
    }

    //@Method maximumIntegerNumber check maximum integer from given integer numbers
    public float maximumFloatNumber(Float first_number,Float second_number, Float third_number){
        float maximum = first_number;
        if (second_number.compareTo(maximum) > 0)
            maximum = second_number;
        if (third_number.compareTo(maximum) > 0)
            maximum = third_number;
        System.out.println("Maximum number=" + maximum);
        return maximum;
    }
}
