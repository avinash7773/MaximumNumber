package com.bridgelabz.generic;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MaximumNumberTest {
    MaximumNumber maximumNumber;

    @BeforeEach
    void setUp() {
        maximumNumber = new MaximumNumber();
    }

    //@testMaximumIntegerNumber check for third position maximum number
    @Test
    void testMaximumIntegerNumber() {
        int result = maximumNumber.maximumIntegerNumber(4,5,8);
        Assert.assertEquals(8,result);
    }

    //@testMaximumFloatNumber check for third position float number is maximum number
    @Test
    void testMaximumFloatNumber() {
        float result = maximumNumber.maximumFloatNumber(5.4f,6.67f,7.4f);
        Assertions.assertEquals(7.4f,result);
    }
}
