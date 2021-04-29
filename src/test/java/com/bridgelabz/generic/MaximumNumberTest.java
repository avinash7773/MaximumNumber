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

    //@testMaximum check for the maximum by using generic
    @Test
    void testMaximum() {
        String result = maximumNumber.maximum("apple","peach","banana");
        Assert.assertEquals("peach",result);
    }
}
