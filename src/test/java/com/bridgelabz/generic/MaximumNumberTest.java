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
}
