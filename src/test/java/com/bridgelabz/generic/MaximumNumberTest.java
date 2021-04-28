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

    //@testMaximumIntegerNumber check for first position number
    @Test
    void testMaximumIntegerNumber() {
        int result = maximumNumber.maximumIntegerNumber(8,4,7);
        Assert.assertEquals(8,result);
    }
}
