package com.epam.task.first.check;

import org.junit.Assert;
import org.junit.Test;

public class ArrayValidatorTest {

    ArrayValidator validator = new ArrayValidator();

    @Test
    public void testIsValidShouldReturnTrueWhenAppliedLineOfNumbers(){
        //given
        String line = "2021:)";

        //when
        boolean actual = validator.isValid(line);

        //then
        Assert.assertEquals(false, actual);
    }

}
