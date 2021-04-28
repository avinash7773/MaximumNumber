package com.bridgelabz.generic;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MaximumNumberTest {
    MaximumNumber maximumNumber;

    @BeforeEach
    void setUp() {
        maximumNumber = new MaximumNumber();
    }

    //@testMaximumIntegerNumber check for third position number
    @Test
    void testMaximumIntegerNumber() {
        int result = maximumNumber.maximumIntegerNumber(4,5,8);
        Assert.assertEquals(8,result);
    }
}
