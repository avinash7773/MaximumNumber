package com.bridgelabz.generic;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MaximumNumberTest {
    MaximumNumber maximumNumber;

    @BeforeEach
    void setUp() {
        maximumNumber = new MaximumNumber(10,20,30);
    }

    //@testMaximum check for the maximum by using generic
    @Test
    void testMaximum() {
        int result = (Integer) maximumNumber.maximum();
        Assert.assertEquals(30,result);
    }

    //@testMaximumwithMultipleParameter method test for multiple parameter maximum method
    @Test
   <T> void testMaximumwithMultipleParameter() {
        T result = (T) maximumNumber.maximum(12.3f,45.4f,56.4f,67.6f,89.5f);
        Assert.assertEquals(89.5f,result);
    }
}
